(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizzbuzz-test
  (testing "One is returned as one"
    (is (= (nth (fizzbuzz) 0) "1"))))
