(defn fac-cps [n k]
	(letfn [(cont [v] (k (* v n)))]
		(if (zero? n)
			(k 1)
			(recur (dec n) cont))))
			
(defn factorial [n]
	(fac-cps n identity))