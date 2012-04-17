(defn gcd [x y]
	(cond
		(> x y) (gcd (- x y) y)
		(< x y) (gcd x (- y x))
		:else x))