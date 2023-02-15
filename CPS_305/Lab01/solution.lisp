(defun add-3 (x)
  (+ x 3))

(defun square (x)
  (* x x))

(defun my-abs (x)
  (abs x))

(defun largest (x y)
  (if (> x y) x y))

(defun dep (b a)
  (if (< a 10000) (+ b a) nil))

(defun wdr (b a)
  (if (and (>= b a) (< a 10000)) (- b a) (+ b a)))

(defvar *balance* 100)

(defun withdraw (amount)
  (cond ((< amount 0) (print "Negative amount"))
        ((>= amount 10000) (print "Exceeds maximum withdrawal amount"))
        ((< *balance* amount) (print "Insufficient funds"))
        ((/= (mod amount 20) 0) (print "Only amounts multiple of 20 are allowed"))
        (t (setf *balance* (- *balance* amount))))
  *balance*)

(defun deposit (amount)
  (cond ((< amount 0) (print "Negative amount"))
        ((>= amount 50000) (print "Exceeds maximum deposit amount"))
        (t (setf *balance* (+ *balance* amount))))
  *balance*)
