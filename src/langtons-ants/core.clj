(ns langtons-ants.core
  (:use [monet.canvas :only [get-context stroke stroke-style stroke-cap begin-path close-path line-to move-to stroke-width]]
        [jayq.core :only [$ document-ready data attr hide]]))

(def spinner ($ :div#spinner))

(defn available-area []
  (let [div (first ($ :div#wrapper))]
    [ (.-offsetWidth div) (.-offsetHeight div) ]))

(document-ready
  (fn []
    (let [canvas    ($ :canvas#world)
          ctx       (get-context (.get canvas 0) "2d")
          [width height] (map #(quot % cell-size) (available-area))
          limit     (dec (* width height))]
      (-> canvas
        (attr :width  (+ 2 (* cell-size width)))
        (attr :height (+ 2 (* cell-size height))))
      (.log js/console "Started...!   size = " width "x" height))))
