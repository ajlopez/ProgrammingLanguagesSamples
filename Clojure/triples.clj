(defn triples [n] 
	(for [a (range 1 n) b (range 1 n) c (range 1 n)] [a b c]))

(defn pythagoras [triple]
	(let [[a b c] triple]
	(= (+ (* a a) (* b b))
	   (* c c))))


