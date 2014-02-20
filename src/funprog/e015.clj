(ns funprog.e015
  (:use quil.core))

(def circle (atom {:x 300 :y 20 :dx 2 :dy -2}))

(defn- update-position [c]
  (-> c
    (update-in [:x] + (c :dx))
    (update-in [:y] + (c :dy))))

(defn- update-direction [c]
  (-> c
    (update-in [:dx] (fn [dx] (if (or (>= (c :x) (width)) (<= (c :x) 0)) (- dx) dx)))
    (update-in [:dy] (fn [dy] (if (or (>= (c :y) (height)) (<= (c :y) 0)) (- dy) dy)))))

(defn setup []
  (stroke (.intValue 0xffd60dff))
  (stroke-weight 7))

(defn draw []
  ; Erase the previous frame
  (background (.intValue 0xff21ea73))

  ; Draw the circle
  (ellipse (@circle :x) (@circle :y) 100 100)

  ; "Mutate" the properties of the circle
  (dosync
    (->> @circle
      update-position
      update-direction
      (reset! circle)))

  )

(sketch
  :title "exercise 15"
  :setup setup
  :draw draw
  :size [500 500]
  :renderer :java2d)
