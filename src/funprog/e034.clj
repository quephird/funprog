(ns funprog.e034
  (:use quil.core))

(defn red-or-shade-of-grey []
  (if (> (random 100) 98)
    [255 0 0]
    (repeat 3 (random 105))))

(defn setup []
  (background 23 100 240)
  (no-stroke)
  (smooth)
  (no-loop))

(defn draw []
  (doseq [x (range 0 (width) 50)
          y (range 0 (height) 10)]
    (apply fill (red-or-shade-of-grey))
    (ellipse (+ x 20) (+ y 20) 44 44)))

(sketch
  :title "exercise 34"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
