(ns hello-world-2.core
  (:require [clojure.data.json :as json]))

(defn data
  []
  (let [data-str (slurp "resources/data.json")
        data (json/read-str data-str :key-fn keyword)]
    data))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (data)))
