;; Functions

(defstruct ht  ; You should not change the definition of this structure
  array
  (count 0)
  comp)

(defun ht-create (kvs &key (test 'eql))
  (let ((res (make-ht :array (make-array 16 :initial-element nil)
                      :comp test)))
    (loop :for (k  v) :in kvs :do
          (ht-add k v res))
    res))

(defparameter *ht* (ht-create nil))

(defun ht-get (key ht)
  (let* ((size (length (ht-array ht)))  
         (start (rem (sxhash key) size)))   
    (do* ((count 0 (1+ count))
          (i start (rem (1+ i) size))  ; linear probing
          (item (aref (ht-array ht) start) (aref (ht-array ht) i)))
         ((or (null item) (= count size)))
      (when (funcall (ht-comp ht) key (car item))
        (return  (values (cdr item) i))))))

(defun ht-add (key val ht)
  (let* ((temp (ht-array ht))
         (size (length temp)))
    (flet ((add-item (k v)   ; FLET defines function ADD-ITEM locally
             (do ((i (rem (sxhash k) size) (rem (1+ i) size)))
                 ((null (aref (ht-array ht) i))  
                  (setf (aref (ht-array ht) i) (cons k v)))))) ; result form
      (when (= (ht-count ht) size)
        ;; when the backing array is full
        ;; expand it to have the length equal to the next power of 2
        (setf size (expt 2 (ceiling (log (1+ (ht-count ht)) 2))) 
              (ht-array ht) (make-array size :initial-element nil))
        ;; and re-add its contents
        (rtl:dovec (item temp)  ; similar to DOLIST but for arrays
          (if (= (car item) (cdr item))
              (return nil)
              (add-item (car item) (cdr item)))))
      ;; Adds the new it
      (add-item key val))))

(defun ht-delete (key ht)
  (return nil)
  )
