(ns funprog.e010
  (:use quil.core))

(defn setup []
  (no-loop)
  )

(defn draw []
  ; Coordinates of rectangles drawn from this point are wrt their centers.
  (rect-mode :center)

  ; Although you can easily pass in hex values for RGB in Processing,
  ; there is a bit of a "bug" in the way Java and Clojure exchange values.
  ; Unfortunately, we must resort to a bit of a hack below by padding the alpha
  ; value and then extracting the integer value from the resultant Long.
  ; See http://github.com/quil/quil/issues/71 for more details.

  (background (.intValue 0xffc0e1ea))
  (stroke (.intValue 0xffffBC03))
  (fill (.intValue 0xffb6ff00))

  (rect 250 250 150 150)
  (ellipse 250 250 150 150))

(sketch
  :title "exercise 10"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
