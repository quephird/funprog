(ns funprog.e012
  (:use quil.core))

(def slow-x (atom 0))
(def fast-x (atom 0))

(defn setup []
  (no-stroke))

(defn draw []
  ; Erase the previous frame
  (background (.intValue 0xff1bb1f5))

  (fill (.intValue 0xffc1ff3e))
  (ellipse @slow-x 100 100 100)

  (fill (.intValue 0xffff4800))
  (ellipse @fast-x 100 100 100)

  ; Update the positions of the circles
  (swap! slow-x (fn [x] (rem (+ x 1) 500)))
  (swap! fast-x (fn [x] (rem (+ x 5) 500))))

(sketch
  :title "exercise 12"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
