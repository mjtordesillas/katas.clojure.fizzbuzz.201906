(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizzbuzz-test
  (testing "A number that is not Fizz or Buzz will be returned as itself"
    (is (= "1" (nth (fizzbuzz) 0)))
    (is (= "26" (nth (fizzbuzz) 25))))
  (testing "A number that is a multiple of 3 is Fizz"
    (is (= "Fizz" (nth (fizzbuzz) 5)))
    (is (= "Fizz" (nth (fizzbuzz) 8))))
  (testing "A number that contains 3 is Fizz"
    (is (= "Fizz" (nth (fizzbuzz) 12)))
    (is (= "Fizz" (nth (fizzbuzz) 22))))
  (testing "A number that is a multiple of 5 or contains a 5 is Buzz"
    (is (= "Buzz" (nth (fizzbuzz) 9)))
    (is (= "Buzz" (nth (fizzbuzz) 39))))
  (testing "A number that contains 5 is Buzz"
    (is (= "Buzz" (nth (fizzbuzz) 51)))
    (is (= "Buzz" (nth (fizzbuzz) 55))))
  (testing "A number that is a multiple of 3 and 5 is FizzBuzz"
    (is (= "FizzBuzz" (nth (fizzbuzz) 29)))
    (is (= "FizzBuzz" (nth (fizzbuzz) 59))))
  (testing "A number that is a multiple of 3 and contains 5 is FizzBuzz"
    (is (= "FizzBuzz" (nth (fizzbuzz) 50))))
  (testing "A number that is a multiple of 5 and contains 3 is FizzBuzz"
    (is (= "FizzBuzz" (nth (fizzbuzz) 29))))
  (testing "A number that contains 5 and 3 is FizzBuzz"
    (is (= "FizzBuzz" (nth (fizzbuzz) 52))))
  (testing "Returns 100 numbers")
    (is (= 100 (count (fizzbuzz)))))
