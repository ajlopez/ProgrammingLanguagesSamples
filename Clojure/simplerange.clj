(defn simple-range [i limit]
(lazy-seq
(when (< i limit)
(cons i (simple-range (inc i) limit)))))

