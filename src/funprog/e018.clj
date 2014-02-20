(ns funprog.e018
  (:use quil.core))

(def x (atom 0))

(defn maybe-change-stroke-color []
  (if (> (random 100) 70)
    (if (> (random 100) 50)
      (stroke 0)
      (stroke 255))))

(defn setup []
  (background 255)
  (stroke 255))

(defn draw []
  (maybe-change-stroke-color)
  (line @x 250 @x 125)
  (swap! x (fn [x] (if (> x (width)) 0 (inc x)))))

(sketch
  :title "exercise 18"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
