(defn inverses [n]
	(lazy-seq (cons (/ 1 n)
					(inverses (inc n))
					)))
					
(comment
	(take 10 (inverses 1))
	(reduce + (take 10 (inverses 1)))
)

(defn sumn [n] (reduce + (take n (inverses 1))))

(def sums (map sumn (iterate inc 1)))

