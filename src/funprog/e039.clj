(ns funprog.e039
  (:use quil.core))

(defn setup []
  (no-stroke)
  (color-mode :hsb))

(defn draw []
  (doseq [x (range 0 (width) 40)]
    (fill (* 255 (noise (/ x 500))) 255 255)
    (ellipse x (/ (height) 2) 20 20)))

(sketch
  :title "exercise 39"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
