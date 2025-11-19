(ns hello-world-2.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [hello-world-2.core :refer [data]]))

(defn a-test-func
  [data]
  data)

(deftest a-test
  (testing "FIXME, I fail - Get the id of the first element"
    (is (= 1 (a-test-func data)))))

(defn b-test-func
  [data]
  data)

(deftest b-test
  (testing "FIXME, I fail - Returns a list of all user names."
    (is (= ["Leanne Graham" "Ervin Howell" "Clementine Bauch"] (b-test-func data)))))

(defn c-test-func
  [data city]
  city)

(deftest c-test
  (testing "FIXME, I fail - Find Users in a Specific City."
    (is (= ["Ervin Howell" "Clementine Bauch"] (c-test-func data "Wisokyburgh")))))

(defn d-test-func
  [data]
  data)

(deftest d-test
  (testing "FIXME, I fail - Find the user with the southernmost latitude."
    (is (= "Clementine Bauch" (d-test-func data)))))

(defn e-test-func
  [data]
  data)

(deftest e-test
  (testing "FIXME, I fail - List all unique website domains."
    (is (= ["hildegard.org" "ramiro.info"] (e-test-func data)))))

(defn f-test-func
  [data]
  data) ; group-by ?

(deftest f-test
  (testing "FIXME, I fail - Index by id."
    (is (= {1 [(first data)]
            2 [(second data)]
            3 [(nth data 2)]}
           (f-test-func data)))))
