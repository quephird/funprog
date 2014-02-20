(ns funprog.e004
  (:use quil.core))

(defn setup []
  ; The argument to frame-rate is the number of times per second
  ; that Processing/quil should redraw the screen.
  (frame-rate 4))

(defn draw []
  ; Randomly the color of the background.
  (let [[arr gee bee] (repeatedly 3 (fn [] (random 100)))]
    (background arr gee bee)))

(sketch
  :title "exercise 4"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
