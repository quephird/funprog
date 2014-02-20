(ns funprog.e021
  (:use quil.core))

(defn rand-color []
  (repeatedly 3 (fn [] (random 255))))

(defn draw-top-line []
  (stroke-weight 7)
  (line 0 0 (width) 0)
  (stroke-weight 2))

(defn change-background-color []
  (apply background (rand-color))
  (draw-top-line))

(defn change-stroke-color []
  (apply stroke (rand-color))
  (draw-top-line))

(defn setup []
  (background 255))

(defn draw [])

(defn mouse-dragged []
  (point (mouse-x) (mouse-y)))

(defn key-pressed []
  (case (raw-key)
    \s (save "e021.png")
    \b (change-background-color)
    \c (change-stroke-color)))

(sketch
  :title "exercise 21"
  :setup setup
  :draw draw
  :mouse-dragged mouse-dragged
  :key-pressed key-pressed
  :size [500 500]
  :renderer :java2d)
