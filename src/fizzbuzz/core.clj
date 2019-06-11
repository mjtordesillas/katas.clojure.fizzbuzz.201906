(ns fizzbuzz.core
  (:gen-class))

(defn- fizz? [number]
  (= 0 (mod number 3)))

(defn- buzz? [number]
  (= 0 (mod number 5)))

(defn fizzbuzz? [number]
  (and (fizz? number) (buzz? number)))

(defn- fizzbuzz-number [number]
  (cond
    (fizzbuzz? number) "FizzBuzz"
    (fizz? number) "Fizz"
    (buzz? number) "Buzz"
    :else (str number)))

(defn fizzbuzz []
  (map #(fizzbuzz-number %) (range 1 101)))