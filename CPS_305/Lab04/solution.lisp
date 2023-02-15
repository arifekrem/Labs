(defstruct movie
  title  director year type)

(defparameter *size* 3)

(defvar *db*)

(setf *db* (make-array *size*  :initial-element nil))

(defvar *db-list*)

(setf *db-list*  nil)  

(defun quicksort (vec comp)
  (when (> (length vec) 1)
    (let ((pivot-i 0)
          (pivot (aref vec (1- (length vec)))))
      (dotimes (i (1- (length vec)))
        (when (funcall comp (aref vec i) pivot)
          (rotatef (aref vec i)
                   (aref vec pivot-i))
          (incf pivot-i)))
      (rotatef (aref vec (1- (length vec)))
               (aref vec pivot-i))
      (quicksort (rtl:slice vec 0 pivot-i) comp)
      (quicksort (rtl:slice vec (1+ pivot-i)) comp)))
  vec)

(defun add-movie (m)
  "Adds a movie to the DB and returns true"
  (dotimes (i *size*)
    (if (nil (aref *db* i))
      (return nil) ((setf (aref *db* i) m)
      (return *db*)))))

(defun add-movie-list (m)
  "Adds a movie to the end of *db-list* and returns the list"
  (setf *db-list* (append *db-list* (list m))))


(defun sort-year ())


(defun sort-title ())


(defun in-db-list? (title)
  (if (member title *db-list*) *db-list* nil))


(defun from-year (year))
