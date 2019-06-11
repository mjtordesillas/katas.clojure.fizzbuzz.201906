(ns fizzbuzz.core
  (:gen-class)
  (:require [clojure.string :as string]))

(defn- fizz? [number]
  (or (= 0 (mod number 3)) (string/includes? (str number) (str 3))))

(defn- buzz? [number]
  (or (= 0 (mod number 5)) (string/includes? (str number) (str 5))))

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