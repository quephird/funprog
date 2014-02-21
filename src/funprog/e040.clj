(ns funprog.e040
  (:use quil.core))

(def t (atom 0))

(defn setup []
  (no-stroke)
  (color-mode :hsb))

(defn draw []
  (doseq [x (range 0 (width) 40)
          y (range 0 (height) 40)]
    (fill (* 255 (noise (/ x 500) (/ y 500) @t)) 255 255)
    (ellipse (+ x 20) (+ y 20) 60 60))

  (swap! t + 0.02))

(sketch
  :title "exercise 40"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
