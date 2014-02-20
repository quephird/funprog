(ns funprog.e016
  (:use quil.core))

(defn setup []
  (background (.intValue 0xff21ea73))
  (no-fill))

(defn draw []
  (let [sw (random 3 10)
        c (repeatedly 3 (fn [] (random 100)))
        x 250
        y 550
        r (random x y)]
    (stroke-weight sw)
    (apply stroke c)
    (ellipse x y r r)))

(sketch
  :title "exercise 16"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
