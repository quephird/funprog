(ns funprog.e013
  (:use quil.core))

(def slow-x (atom 0))
(def fast-x (atom 0))

(defn setup []
  (no-stroke))

(defn draw []
  (let [frame-color (.intValue 0xff1bb1f5)
        slow-color (.intValue 0xffc1ff3e)
        fast-color (.intValue 0xffff4800)
        test-val (random 10)
        fast-d 100
        slow-d (if (> test-val 9) (* fast-d 1.2) fast-d)]
    ; Erase the previous frame
    (background frame-color)

    ; Slow circle
    (fill slow-color)
    (ellipse @slow-x 100 slow-d slow-d)

    ; Fast circle
    (fill fast-color)
    (ellipse @fast-x 100 fast-d fast-d))

  ; Update the positions of the circles
  (swap! slow-x (fn [x] (rem (+ x 1) 500)))
  (swap! fast-x (fn [x] (rem (+ x 5) 500))))

(sketch
  :title "exercise 13"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
