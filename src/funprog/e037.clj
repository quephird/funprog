(ns funprog.e037
  (:use quil.core))

(def n (atom 10.0))

(defn setup []
  (background (.intValue 0xff810c2f))
  (fill 255)
  (no-stroke)
  (smooth)
  (rect-mode :center))

(defn draw []
  (let [x (* (noise (+ @n 80)) (width))
        y (* (noise (+ @n 100)) (height))
        w (* (noise (+ @n 30)) 200)
        h (* (noise @n) 200)
        θ (* (noise (+ @n 40)) 10)]
    (background (.intValue 0xff810c2f))

    (translate x y)
    (rotate θ)
    (rect 0 0 w h)

    (swap! n + 0.02)))

(sketch
  :title "exercise 37"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
