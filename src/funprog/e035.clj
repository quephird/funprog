(ns funprog.e035
  (:use quil.core))

(def θ (atom 0.0))

(defn rotating-rectangle [x y w θ]
  (translate x y)
  (rotate θ)
  (rect 0 0 w w)
  (reset-matrix))

(defn setup []
  (background 100 200 50)
  (no-stroke)
  (smooth))

(defn draw []
  (background 100 200 50)

  (doseq [x (range 11)
          y (range 15)]
    (rotating-rectangle (+ 50 (* x 40))
                        (+ 50 (* y 30))
                        16
                        (+ @θ x y)))

  (swap! θ + 0.05))

(sketch
  :title "exercise 35"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
