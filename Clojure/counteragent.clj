(def counter (agent 0))

(defn tick []
    (send counter inc))

