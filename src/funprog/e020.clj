(ns funprog.e020
  (:use quil.core))

(defn setup []
  (background 255))

(defn draw [])

(defn mouse-dragged []
  (point (mouse-x) (mouse-y)))

(defn key-pressed []
  (save "my-first-drawing.png"))

(sketch
  :title "exercise 20"
  :setup setup
  :draw draw
  :mouse-dragged mouse-dragged
  :key-pressed key-pressed
  :size [500 500]
  :renderer :java2d)

