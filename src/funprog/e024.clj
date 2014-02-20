(ns funprog.e024
  (:use quil.core))

(defn setup []
  (background 0)
  (color-mode :hsb)
  (no-fill)
  (no-loop))

(defn draw []
  (let [c [(random 255) (random 50 100) (random 50 100)]]
    (apply background c)
    (stroke 255 100)
    (doseq [i (range 70)]
      (ellipse (+ (/ (width) 2) i) (- (/ (height) 2) i) (+ 100 (* i 5)) (- 100 (* i 5))))))

(sketch
  :title "exercise 24"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
