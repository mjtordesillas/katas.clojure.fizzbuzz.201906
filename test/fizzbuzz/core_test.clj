(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizzbuzz-test
  (testing "A number that is not Fizz or Buzz will be returned as itself"
    (is (= (nth (fizzbuzz) 0) "1"))
    (is (= (nth (fizzbuzz) 22) "23")))
  (testing "A number that is a multiple of 3 is Fizz"
    (is (= (nth (fizzbuzz) 2) "Fizz"))
    (is (= (nth (fizzbuzz) 8) "Fizz")))
  (testing "A number that is a multiple of 5 is Buzz"
    (is (= (nth (fizzbuzz) 4) "Buzz"))
    (is (= (nth (fizzbuzz) 24) "Buzz")))
  (testing "A number that is a multiple of 3 and 5 is FizzBuzz"
    (is (= (nth (fizzbuzz) 29) "FizzBuzz"))
    (is (= (nth (fizzbuzz) 14) "FizzBuzz")))
  (testing "Returns 100 numbers")
    (is (= (count (fizzbuzz)) 100)))
