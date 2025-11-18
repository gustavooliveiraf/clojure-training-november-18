(ns hello-world-2.core-test
  (:require [clojure.test :refer :all]
            [hello-world-2.core :refer :all :as core]))

(deftest a-test
  (testing "FIXME, I fail - Get the id of the first element"
    (is (= 1 (core/data)))))
