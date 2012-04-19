
(def ^:dynamic foo 10)

(defn print-foo [] (println foo))

(defn try1 []
    (.start (Thread. (fn [] (let [foo 12] (print-foo))))))
    
(defn try2 []
    (.start (Thread. (fn [] (binding [foo 12] (print-foo))))))

    