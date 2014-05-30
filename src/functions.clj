(ns clojure.functions)


(def anonymous (fn [x] (+ x x)))

(def anonymous-with-name (fn add [a b] (+ a b)))

(defn anonymous-hash [x y z]
  (#(+ %1 %2 %3) x y z))


