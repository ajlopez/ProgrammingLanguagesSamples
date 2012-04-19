(def counter (ref 0))

(defn tick []
    (dosync (alter counter inc)))

