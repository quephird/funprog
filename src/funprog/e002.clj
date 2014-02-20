(ns funprog.e002
  (:use quil.core))

(defn setup []
  (no-loop))

(defn draw []
  ; Draw a line by using individual points...
  (doseq [x (range 50 56)]
    (point x 50))

  ; ... or by using the native line command.
  (line 0 0 99 99))

(sketch
  :title "exercise 2"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
