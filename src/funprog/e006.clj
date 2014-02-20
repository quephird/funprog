(ns funprog.e006
  (:use quil.core))

(defn setup []
  ; The sets the background to black.
  )

(defn draw []
  ; By setting the background here instead of in setup above,
  ; everything that was drawn in the previous frame is erased.
  (background 0)

  ; Set the color of the "pen" to a random shade of pure green.
  (stroke 255)

  ; Randomly draw one line from the center of the window out.
  ; Note that we have assumed that the numbers agree with
  ; what is passed to :setup in the sketch macro below.
  (let [[y1 y2] (repeatedly 2 (fn [] (random 500)))]
    (line 0 y1 499 y2)))

(sketch
  :title "exercise 6"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
