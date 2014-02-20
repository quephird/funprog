(ns funprog.e028a
  (:use quil.core))

(def r (atom 0.0))

(defn setup []
  (background 10)
  (no-stroke)
  (smooth)
  (no-loop)
  (fill 255))

(defn draw []
  ; This version runs much faster since it is not throttled by the default frame rate.
  (translate 250 250)
  (doseq [_ (range 1000)]
    (let [circle-d (random 5 15)]
      (rotate @r)
      (ellipse (+ 100 @r) 10 circle-d circle-d)
      (swap! r + 0.2))))

(sketch
  :title "exercise 28a"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)

