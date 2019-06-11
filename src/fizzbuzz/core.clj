(ns fizzbuzz.core
  (:gen-class)
  (:require [clojure.string :as string]))

(defn- contains-digit? [number digit]
  (string/includes? (str number) (str digit)))

(defn- is-multiple? [number denominator]
  (= 0 (mod number denominator)))

(defn- fizz? [number]
  (or (is-multiple? number 3) (contains-digit? number 3)))

(defn- buzz? [number]
  (or (is-multiple? number 5) (contains-digit? number 5)))

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