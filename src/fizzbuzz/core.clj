(ns fizzbuzz.core
  (:gen-class))

(defn- fizz? [number]
  (= 0 (mod number 3)))

(defn- fizzbuzz-number [number]
  (if (fizz? number)
    "Fizz"
    (str number)))

(defn fizzbuzz []
  (map #(fizzbuzz-number %) (range 1 100)))