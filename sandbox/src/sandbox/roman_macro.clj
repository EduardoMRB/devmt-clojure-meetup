(ns sandbox.roman-macro)

(def arabic->roman 
  (partial clojure.pprint/cl-format nil "~@R"))

(defn roman->arabic [r]
  (->> (reverse r)
       (replace (zipmap "MDCLXVI" [1000 500 100 50 10 5 1]))
       (partition-by identity)
       (map (partial apply +))
       (reduce #(if (< %1 %2) (+ %1 %2) (- %1 %2)))))

(defn- emit-roman-def [n]
  (let [roman (arabic->roman n)]
    `(def ~(symbol roman) ~n)))

(defmacro roman-symbol [arabic-number-range]
  `(dorun [~@(for [n (eval arabic-number-range)]
                  (emit-roman-def n))]))

(roman-symbol (range 500))
