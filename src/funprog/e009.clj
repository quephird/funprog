(ns funprog.e009
  (:use quil.core))

(defn setup []
  ; No need to set anything here.
  )

(defn draw []
  (let [arr (random 200 256)
        gee (random 200 256)
        bee (random 50 100)
        x (random 500)]
    ; Set the color of the "pen" to a random shade of yellow.
    (stroke arr gee bee)

    ; Draw a random vertical line
    (line x 0 x 499)))

(sketch
  :title "exercise 9"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
