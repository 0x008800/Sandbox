(defun AreaOfCircle()
  	(terpri)
  	(princ "Enter Radius: ")
  	(setq radius (read))
  	(setq area (* 3.1415 radius radius))
  	(format t "Radius: = ~F~%Area = ~F" radius area)
  )

;(AreaOfCircle)
