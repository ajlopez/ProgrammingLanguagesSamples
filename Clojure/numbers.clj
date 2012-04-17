(def numbers (iterate inc 1))

(defn sumn [n]
	(/ (* n (+ n 1)) 2)
	)

(def sums (map sumn numbers))

(comment
	(take 10 sums)
	(take 10 (filter even? sums))
	(nth sums 99)
)

