(ns funprog.e023
  (:use quil.core))

(defn setup []
  (background 0)
  (color-mode :hsb)
  (no-loop))

(defn draw []
  (let [c [(random 255) (random 50 100) (random 50 100)]]
    (apply background c)
    (no-fill)
    (stroke 255 100)
    (doseq [i (range 125)]
      (ellipse (+ 100 (* i 2)) (+ 100 (* i 2)) (+ 100 i) (- 100 (* i 2))))))

(sketch
  :title "exercise 23"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
