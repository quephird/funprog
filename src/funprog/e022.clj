(ns funprog.e022
  (:use quil.core))

(defn setup []
  (background 0)
  (no-stroke))

(defn draw []
  (let [x (random (width))
        y (random (height))]
    ; Drawing a rectangle with low opacity on top of
    ; previously drawn circles, instead of issuing a (background <color>)
    ; command produces a fading effect.
    (fill 0 10)
    (rect 0 0 (width) (height))

    (fill 255)
    (ellipse x y 3 3)))

(sketch
  :title "exercise 22"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
