(ns funprog.e036
  (:use quil.core))

(def n (atom 0.0))

(defn setup [])

(defn draw []
  (let [x (* (noise @n) (width))
        y (* (noise (+ @n 40)) (height))]
    (background (* 255 (noise (+ @n 100))))
    (stroke 255)

    (line x 0 x (height))
    (line 0 y (width) y)

    (swap! n + 0.02)))

(sketch
  :title "exercise 36"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)

