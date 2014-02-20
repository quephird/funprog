(ns funprog.e011
  (:use quil.core))

(def x (atom 0))

(defn setup []
  (no-stroke)
  (fill (.intValue 0xffc1ff3e)))

(defn draw []
  ; Erase the previous frame
  (background (.intValue 0xff1bb1f5))

  (ellipse @x 100 100 100)

  ; Update the position of the circle
  (swap! x inc))

(sketch
  :title "exercise 11"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
