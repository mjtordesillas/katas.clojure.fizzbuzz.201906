(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizzbuzz-test
  (testing "A number that is not Fizz or Buzz will be returned as itself"
    (is (= "1" (nth (fizzbuzz) 0)))
    (is (= "26" (nth (fizzbuzz) 25))))
  (testing "A number that is a multiple of 3 or contains a 3 is Fizz"
    (is (= "Fizz" (nth (fizzbuzz) 2)))
    (is (= "Fizz" (nth (fizzbuzz) 8)))
    (is (= "Fizz" (nth (fizzbuzz) 12)))
    (is (= "Fizz" (nth (fizzbuzz) 22))))
  (testing "A number that is a multiple of 5 or contains a 5 is Buzz"
    (is (= "Buzz" (nth (fizzbuzz) 4)))
    (is (= "Buzz" (nth (fizzbuzz) 24)))
    (is (= "Buzz" (nth (fizzbuzz) 51)))
    (is (= "Buzz" (nth (fizzbuzz) 55))))
  (testing "A number that is a multiple of 3 and 5 is FizzBuzz"
    (is (= "FizzBuzz" (nth (fizzbuzz) 29)))
    (is (= "FizzBuzz" (nth (fizzbuzz) 14))))
  (testing "Returns 100 numbers")
    (is (= 100 (count (fizzbuzz)))))
