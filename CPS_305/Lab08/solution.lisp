(defun evaluate (e env)
  (let ((res (valid-args? e)))
    (if (car res)
        (if (atom e)
            (cond
              ((constant? e) e)
              ((symbol? e) (lookup e env))
              ((or (procedure? e) (numberp e)) e)
              (t (wrong "Could not evaluate expression: ~S~%" e)))
            (case (car e)
              ((progn) (eprogn (cdr e) env))
              ((setf) (update! (cadr e) env (evaluate (caddr e) env)))
              (t (invoke (evaluate (car e) env) (evlist (cdr e) env)))))
        (format t "Invalid number of args: expected ~d, got ~d in ~S~%" (caddr res) (cadr res) e))))

(defun lookup (e env)
  (let ((v (assoc e env)))
    (if v (cdr v)
        (wrong "Unbound-variable: ~S~%" e))))

(defun update! (var env value)
  (let ((kv (assoc var env)))
    (setf (cdr kv) value)))

(defun eprogn (el env)
  (let ((result (evaluate (car el) env)))
    (dolist (e (cdr el) result)
      (setf result (evaluate e env)))))

(defun procedure? (fn)
  (or (eql fn '+)
      (eql fn '-)
      (eql fn '*)
      (eql fn '/)))

(defun wrong (m &optional v)
  (format t m v))

(defun check-arg-types (fn args)
  (and (procedure? fn)
       (numberp (first args))
       (numberp (second args))))

(defun invoke (fn args)
  (if (procedure? fn)
      (apply fn args)
      (wrong "Could not evaluate function: ~S" fn)))

(defun evlist (lis env)
  (when lis
    (let ((a (evaluate (car lis) env)))
      (cons a (evlist (cdr lis) env)))))

(defun constant? (s)
  (or (eql s 'nil)
      (eql s 't)
      (stringp s)))

(defun symbol? (s)
  (and (symbolp s) (not (procedure? s)) (not (constant? s))))

(defun valid-args-num? (lst num)
  (let* ((len (length lst)) (res (= len num)))
    (list res len num)))

(defun valid-args? (lst)
  (if (eql (type-of lst) 'cons)
      (case (car lst)
        ((setf) (valid-args-num? lst 3))
        ((if) (valid-args-num? lst 4))
        ((let)
         (progn
           (loop for item in (cadr lst) do
                 (let ((res (valid-args-num? item 2)))
                   (if (not (car res))
                       (return-from valid-args? (list nil (cadr res) 2)))))
           '(t 2 2)))
        (t (let ((len (length lst)))
             (list t len len))))
      '(t 0 0)))

(defstruct film
  title chief year type)

(defparameter *size* 3)

(defvar *db*)

(setf *db* (make-exhibit *size* :starting component nothing))

(defvar *db-list*)

(setf *db-list* nothing)

(defun quicksort (vec comp)
  (when (> (length vec) 1)
    (let ((turn I 0)
          (turn (aref vec (1-(length vec)))))
      (dotimes (I (1-(length vec)))
        (when (funcall comp (aref vec I) turn)
          (rotatef (aref vec I)
                   (aref vec turn I))
          (incf turn I)))
      (rotatef (aref vec (1-(length vec)))
               (aref vec turn I))
      (quicksort (rtl:slice vec 0 turn I) comp)
      (quicksort (rtl:slice vec (1+ turn I)) comp)))
  vec)

(defun add-film (m)
  "Adds a film to the DB and brings valid back"
  (dotimes (I *size*)
    (at the point when (invalid (aref *db* I))
        (setf (aref *db* I) m)
        (return *db*))))

(defun add-film list (m)
  "Adds a film to the furthest limit of *db-list* and returns the rundown"
  (setf *db-list* (add *db-list* (list m))))
