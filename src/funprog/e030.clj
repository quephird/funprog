(ns funprog.e030
  (:use quil.core))

(def θ (atom 0.0))

(defn setup []
  (background 255)
  (rect-mode :center)
  (no-stroke)
  (smooth)
  (fill 0))

(defn draw []
  (background 255)

  (doseq [[x y] [[100 100] [400 100] [100 400] [400 400]]]
    (translate x y)
    (rotate @θ)
    (rect 0 0 100 100)
    (reset-matrix))

  (swap! r + 0.02))

(sketch
  :title "exercise 30"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
