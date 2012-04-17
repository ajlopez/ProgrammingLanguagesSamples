(defn rec-step [[x & xs]]
(if x
[x (rec-step xs)]
[]))

(comment 
	(rec-step (range 10))
	(rec-step (range 10000))
)

(defn lz-rec-step [s]
	(lazy-seq
		(if (seq s)
			[(first s) (lz-rec-step (rest s))]
			[])))

(comment 
	(lz-rec-step (range 10))
	(lz-rec-step (range 10000))
)

			