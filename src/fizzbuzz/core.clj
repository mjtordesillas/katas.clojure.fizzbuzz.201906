(ns fizzbuzz.core
  (:gen-class))

(defn- fizz? [number]
  (= 0 (mod number 3)))

(defn- buzz? [number]
  (= 0 (mod number 5)))

(defn- fizzbuzz-number [number]
  (if (fizz? number)
    "Fizz"
    (if (buzz? number)
      "Buzz"
      (str number))))

(defn fizzbuzz []
  (map #(fizzbuzz-number %) (range 1 100)))