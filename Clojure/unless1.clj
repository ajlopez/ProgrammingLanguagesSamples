; This is doomed to fail...
(defn unless [expr form]
(if expr nil form))