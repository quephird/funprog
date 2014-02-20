(ns funprog.e014
  (:use quil.core))

(def x (atom 300))
(def y (atom 20))

(defn setup []
  (stroke (.intValue 0xffd60dff))
  (stroke-weight 7))

(defn draw []
  ; Erase the previous frame
  (background (.intValue 0xff21ea73))

  (ellipse @x @y 100 100)

  ; Update the position of the circle
  (swap! x (fn [n] (- n 2)))
  (swap! y (fn [n] (+ n 2))))

(sketch
  :title "exercise 14"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
