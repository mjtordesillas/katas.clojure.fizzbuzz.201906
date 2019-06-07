(ns fizzbuzz.core
  (:gen-class))

(defn fizzbuzz []
   (map #(str %) (range 1 100)))