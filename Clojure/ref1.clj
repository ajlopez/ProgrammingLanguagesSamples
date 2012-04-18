
(def numbers [1 2 3 4])

(comment
   (conj numbers 5 6)
)

(def nums (ref numbers))

(alter nums conj 5 6)

(dosync (alter nums conj 5 6))

(def nums2 (ref numbers))

