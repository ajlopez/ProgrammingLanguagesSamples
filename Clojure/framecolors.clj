(defn xors [max-x max-y] (for [x (range max-x) y (range max-y)] [x y (bit-xor
x y)]))

(def frame (java.awt.Frame.))

(.setSize frame (java.awt.Dimension. 200 200))

(.show frame)

(def gfx (.getGraphics frame))

(doseq [[x y xor] (xors 200 200)]
(.setColor gfx (java.awt.Color. xor xor xor))
(.fillRect gfx x y 1 1))

