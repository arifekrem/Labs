(defun a-sum (n p) 
  (setf a 0)
  (loop for i from n to p
        do (incf a i)
  )
  (print a)
  )

(defun sum-odd (n p)
  (setf a 0)
  (loop for i from n to p
        do (if (= (mod i 2) 1) (incf a i))
  )
  (print a)
)

(defun my-function (f) (funcall f 1))

(defun sigma (f n p)
  (setf a 0)
  (loop for i from n to p
        do (incf a (funcall f i))
  )
  (print a)
 )
