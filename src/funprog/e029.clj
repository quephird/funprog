(ns funprog.e029
  (:use quil.core))

(def r (atom 0.0))
(def back-c (atom []))

(defn setup []
  (reset! back-c (repeatedly 3 (fn [] (random 100))))
  (apply background @back-c)
  (rect-mode :center)
  (no-stroke)
  (smooth))

(defn draw []
  ; Repaint background with alpha to yield tailing effect
  (apply fill (conj @back-c 50))
  (rect (/ (width) 2) (/ (height) 2) (width) (height))

  ; Draw rotating rectangle around mouse pointer
  (fill 255)
  (translate (mouse-x) (mouse-y))
  (rotate @r)
  (rect 0 0 100 100)

  (swap! r + 0.05))

(sketch
  :title "exercise 29"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
