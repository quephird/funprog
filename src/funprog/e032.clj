(ns funprog.e032
  (:use quil.core))

(def θ (atom 0.0))

(defn rotating-rectangle [x y w θ]
  (translate x y)
  (rotate θ)
  (rect 0 0 w w)
  (reset-matrix))

(defn setup []
  (background 255)
  (rect-mode :center)
  (no-stroke)
  (smooth)
  (fill 0))

(defn draw []
  (background 255)

  (doseq [[x y w] [[100 100 80]
                   [400 100 40]
                   [100 400 100]
                   [400 400 20]
                   [250 250 150]]]
    (rotating-rectangle x y w @θ))
  (swap! θ + 0.02))

(sketch
  :title "exercise 32"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
