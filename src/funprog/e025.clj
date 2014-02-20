(ns funprog.e025
  (:use quil.core))

(defn rand-color []
  (repeatedly 3 (fn [] (random 255))))

(defn setup []
  (background (.intValue 0xff3355cc)))

(defn draw []
  ; Note that the alpha value is incorporated in the sole parameter,
  ; not as a second one like in the original example.
  (fill (.intValue 0x143355cc))
  (rect 0 0 (width) (height)))

(defn key-pressed []
  (fill (.intValue 0xffffe200))
  (text-size (random 20 200))

  ; For some reason, I need to str the return of raw-key to avoid
  ; a ClassCastException from Character to String.
  (text (str (raw-key)) (random 500) (random 100 500)))

(sketch
  :title "exercise 25"
  :setup setup
  :draw draw
  :key-pressed key-pressed
  :size [500 500]
  :renderer :java2d)
