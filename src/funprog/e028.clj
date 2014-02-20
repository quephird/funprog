(ns funprog.e028
  (:use quil.core))

(def r (atom 0.0))

(defn setup []
  (background 10)
  (no-stroke)
  (smooth)
  (fill 255))

(defn draw []
  (translate (/ (width) 2) (/ (height) 2))
  (let [circle-d (random 5 15)]
    (rotate @r)
    (ellipse (+ 100 @r) 10 circle-d circle-d)
    (swap! r + 0.2)))

(sketch
  :title "exercise 28"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)

