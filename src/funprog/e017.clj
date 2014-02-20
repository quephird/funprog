(ns funprog.e017
  (:use quil.core))

(defn setup []
  (background (.intValue 0xff04b1ce))
  (no-fill)
  (color-mode :hsb))

(defn draw []
  (let [sw (random 3 10)
        c [(random 255) 255 255]
        x 250
        y 550
        r (random x y)]
    (stroke-weight sw)
    (apply stroke c)
    (ellipse x y r r)))

(sketch
  :title "exercise 17"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
