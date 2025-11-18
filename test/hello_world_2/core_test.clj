(ns hello-world-2.core-test
  (:require [clojure.test :refer :all]
            [hello-world-2.core :refer :all :as core]))

(deftest a-test
  (testing "FIXME, I fail - Get the id of the first element"
    (is (= 1 (core/data)))))

(defn b-test-func
  [data]
  data)

(deftest b-test
  (testing "FIXME, I fail - Returns a list of all user names."
    (is (= ["Leanne Graham" "Ervin Howell" "Clementine Bauch"] (b-test-func (core/data))))))
