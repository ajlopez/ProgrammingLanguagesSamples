(defn fibo2 [pair]
	(let [x (first pair) y (second pair)] 
		 [(+ x y) x])
)

(def fibonacci (iterate fibo2 [1 1]))