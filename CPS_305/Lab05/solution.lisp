(defun arith-eval (expr)
  "EXPR is a list of symbols that may include:
square brackets, arithmetic operations, and numbers."
  (let ((ops ())
        (vals ())
        (op nil)
        (val nil)
        (open 0)
        (close 0))
    (dolist (item expr)
      (case item
        ([ (incf open)) ; do nothing
        ((+ - * / ^ SDIV MAXF FACT) (push item ops))
        (] (setf op (pop ops) val (pop vals)) (incf close)
         (case op
           (+ (setf val (+ val (pop vals))))
           (- (setf val (- (pop vals)  val)))
           (* (setf val (* val (pop vals))))
           (/ (setf val (/ (pop vals)  val)))
           (^ (setf val (expt (pop vals) val)))
           (SDIV (setf val (/ (+ (* -1 (pop vals)) (pop vals)) val)))
           (MAXF (let ((b (pop vals)) (a (pop vals)) (c val)) (cond ((and (> a b) (> a c)) (setf val a)) ((and (> b a) (> b c)) (setf val b)) ((and (> c a) (> c b)) (setf val c)))))
           (FACT (do ((sum 1) (iter val (1- iter))) ((= iter 1) (setf val sum)) (setf sum (* sum iter)))))
         (push val vals))
        (otherwise (push item vals))))
    (if (= open close) (pop vals) (return-from arith-eval "Error"))))


; use if statements because they're easier to work with strings (that's what the ta said)
