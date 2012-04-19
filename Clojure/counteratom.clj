(def counter (atom 0))

(defn tick []
    (swap! counter inc))

