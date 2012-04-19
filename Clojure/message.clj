
; based on chat.clj from Programming Clojure

(defstruct message :sender :text)

(struct message "stu" "test message")

; list of messages

(def messages (ref ()))

(defn naive-add-message [msg]
    (dosync (ref-set messages (cons msg @messages))))
    
(defn add-message [msg]
    (dosync (alter messages conj msg)))
    
(comment
    (dosync (commute messages conj msg))
)
