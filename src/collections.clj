(ns clojure.collections)

(def number-list (list 1 2 3 4 5 6))

(defn list-get [x]
  (nth number-list x))


(def number-vector [1 2 3 4 5 6])

(defn vector-get [x]
  (get number-vector x))


(def own-hashmap {:one 1 :two 2 :three 3 :four 4})

(defn hashmap-get-with-key [key]
  (own-hashmap key))