(ns funprog.e003
  (:use quil.core))

(defn setup []
  (no-loop))

(defn draw []
  ; This is a pretty ugly, eggy yellow >_<
  (background 255 204 0)

  ; Draw a line starting from and ending at a random point.
  (let [[x1 y1 x2 y2] (repeatedly 4 (fn [] (random 100)))]
    (line x1 y1 x2 y2)))

(sketch
  :title "exercise 3"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
