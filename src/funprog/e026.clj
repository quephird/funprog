(ns funprog.e026
  (:use quil.core))

(defn setup []
  (background (.intValue 0xff6aa211e))
  (no-stroke)
  (smooth)
  (no-loop))

(defn draw []
  ; No need for a while statement here with a local variable,
  ; as the example has, because it is never used.
  (doseq [_ (range 100)]
    ; Draw a rectangle with a random shade of grey.
    (fill (random 255))
    (rect 200 10 50 5)

    ; Draw a red rectangle
    (fill 255 0 0)
    (rect 260 10 10 5)

    ; Rotate the axes; this will result in two arcs of rectangles.
    (rotate 0.02)))

(sketch
  :title "exercise 26"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
