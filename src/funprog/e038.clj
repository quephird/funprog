(ns funprog.e038
  (:use quil.core))

(def t (atom 0))

(defn setup []
  (stroke 0 0 255))

(defn draw []
  (background 255)
  (doseq [x (range (width))]
    (line x (+ 200 (* 50 (noise (/ x 100) @t))) x (height)))

  (swap! t + 0.02))

(sketch
  :title "exercise 38"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
