(ns funprog.e027
  (:use quil.core))

(def r (atom 0.0))

(defn setup []
  (background 10)
  (no-stroke)
  (smooth)
  (fill 255))

(defn draw []
  (let [circle-d (random 5 15)]
    (rotate @r)
    (ellipse (+ 100 @r) 10 circle-d circle-d)
    (swap! r + 0.2)))

(sketch
  :title "exercise 27"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)

