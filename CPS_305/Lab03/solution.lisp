(defstruct movie
  title  director year type)

(defparameter *size* 3) 

(defvar *db*)

(setf *db* (make-array *size*  :initial-element nil))

(defun add-movie (m)
  (dotimes (i *size*)
    (if (in-db? m)
        (return nil)
        (when (null (aref *db* i))
        (setf (aref *db* i) m)
        (return *db*)))))

(defun in-db? (title)
  "Returns *db* if movie title is in the database; otherwise returns NIL"
  (dotimes (i *size*)
    (when (and (typep (aref *db* i) 'movie)
               (equal (movie-title (aref *db* i)) title))
      (return *db*))))

(defun delete-movie (title)
  (dotimes (i *size*)
    (if (null (aref *db* i))
        ((remove (aref *db* i) m)
         (return *db*)
         (return nil)))))

(defun replace-movie (m nm)
 )

(defun num-movies  
    (return (fill-pointer *db*))
  )
