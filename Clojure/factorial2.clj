(defn factorial2 [n result]
	(if (pos? n) (recur (dec n) (* result n)) result))

(defn factorial [n]
	(factorial2 n 1))
	
