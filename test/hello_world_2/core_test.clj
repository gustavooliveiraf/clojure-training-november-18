(ns hello-world-2.core-test
  (:require [clojure.test :refer :all]
            [hello-world-2.core :refer :all :as core]))

#_(deftest a-test
  (testing "FIXME, I fail - Get the id of the first element"
    (is (= 1 (core/data)))))

(defn b-test-func
  [data]
  data)

#_(deftest b-test
  (testing "FIXME, I fail - Returns a list of all user names."
    (is (= ["Leanne Graham" "Ervin Howell" "Clementine Bauch"] (b-test-func (core/data))))))

(defn c-test-func
  [data city]
  city)

(deftest c-test
  (testing "FIXME, I fail - Find Users in a Specific City."
    (is (= ["Ervin Howell" "Clementine Bauch"] (c-test-func (core/data) "Wisokyburgh")))))

(defn d-test-func
  [data]
  data)

(deftest d-test
  (testing "FIXME, I fail - Find the user with the southernmost latitude."
    (is (= ["Clementine Bauch"] (d-test-func (core/data))))))
