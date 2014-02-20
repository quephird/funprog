(ns funprog.e033
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

  (doseq [[x y w c] [[100 100 80 1.0]
                   [400 100 40 0.3]
                   [100 400 100 0.6]
                   [400 400 20 1.2]
                   [250 250 150 2.3]]]
    (rotating-rectangle x y w (* @θ c)))
  (swap! θ + 0.02))

(sketch
  :title "exercise 33"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
