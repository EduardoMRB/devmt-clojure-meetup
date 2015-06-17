(ns sandbox.core)

(defmacro infix-notation [form]
  `(~(second form) ~(first form) ~(last form)))

(infix-notation (1 + 2)) ;;=> 3
