(defn factorial [n]
	(letfn [(factorial2 [n result]
				(if (pos? n) (recur (dec n) (* result n)) result))]
			(factorial2 n 1)))
	
