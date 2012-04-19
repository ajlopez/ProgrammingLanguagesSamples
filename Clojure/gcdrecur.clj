(defn gcd [x y]
	(cond
		(> x y) (recur (- x y) y)
		(< x y) (recur x (- y x))
		:else x))