(defn factorial [n]
	(if (pos? n)
		(* n (factorial (dec n)))
		1))
		
