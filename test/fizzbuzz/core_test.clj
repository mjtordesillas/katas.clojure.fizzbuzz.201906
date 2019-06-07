(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizzbuzz-test
  (testing "A number that is not Fizz or Buzz will be returned as itself"
    (is (= (nth (fizzbuzz) 0) "1"))
    (is (= (nth (fizzbuzz) 22) "23"))))
