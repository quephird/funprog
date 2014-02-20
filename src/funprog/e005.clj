(ns funprog.e005
  (:use quil.core))

(defn setup []
  ; The sets the background to black.
  ; Note that by default, draw() is continually called.
  (background 0))

(defn draw []
  ; Set the color of the "pen" to a random shade of pure green.
  (stroke 0 (random 255) 0)

  ; Randomly draw lines from the center of the window out.
  ; Note that we have assumed that the numbers agree with
  ; what is passed to :setup in the sketch macro below.
  (let [[x y] (repeatedly 2 (fn [] (random 500)))]
    (line 250 250 x y)))

(sketch
  :title "exercise 5"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
