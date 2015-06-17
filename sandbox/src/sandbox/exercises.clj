(ns sandbox.exercises
  (:require [sandbox.hue-br :refer :all]))

;; Somar numeros numa lista de inteiros
(defn sum [coll]
  (reduce + coll))

(função somar [lista]
  (reduzir + lista))

;; Verificar se lista esta vazia
(defn empty? [coll]
  (if (seq coll)
    false)
    true)

(função vazia? [lista]
  (se (seq lista)
    falso
    verdadeiro))

;; Pegar numeros pares de uma colecao
(defn even-numbers [coll]
  (filter even? coll))

(função numeros-pares [sequencia]
  (remover impar? sequencia))

;; Pig latin
(defn pig-lat [sentence]
  (let [first-letter (first sentence)
        rest-string (vec (rest sentence))]
    (apply str (conj rest-string first-letter "ay"))))

(função latim-do-porco [frase]
  (permitir [primeira-letra (primeiro frase)
             resto-da-frase (vet (resto frase))]
    (aplicar str (unir resto-da-frase primeira-letra "ay"))))
