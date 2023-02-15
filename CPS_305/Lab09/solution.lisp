(defun has-loop (a b)
  (let ((res  ()))
    (dolist (x a)
      
      (push
      (car x) res)

      (print res)
      (when (member b res)

        (if (and  (equal (cdr x) nil)
                  (equal (car x) b) )
         (return-from has-loop nil))

        (if
         (member (cdr x) res)
         (return-from has-loop t))))


    nil))
