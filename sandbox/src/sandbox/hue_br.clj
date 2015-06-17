(ns sandbox.hue-br)

(def ^:private pt-functions
  '{acumular map
    reduzir reduce
    filtrar filter
    pegar take
    pegar-enquanto take-while
    largar drop
    largar-enquanto drop-while
    particionar partition
    partitionar-por partition-by
    particionar-tudo partition-all
    remover remove
    interpor interpose
    entrefolhear interleave
    par? even?
    impar? odd?
    falso false
    verdadeiro true
    ordenar sort
    ordenar-por sort-by
    aplicar apply
    vet vec
    primeiro first
    resto rest
    unir conj})

(def ^:private pt-macros
  '{se if
    quando when
    enquanto while
    função defn
    definir def
    para for
    permitir let})

(defn- translate-fn [[new-name old-name]]
  `(def ~new-name ~old-name))

(defmacro translate-fns []
  `(dorun [~@(map translate-fn pt-functions)]))

(defn- translate-macro [[new-name old-name]]
  `(defmacro ~new-name [~'& body#]
     `(~'~old-name ~@body#)))

(defmacro translate-macros []
  `(dorun [~@(map translate-macro pt-macros)]))

(translate-fns)
(translate-macros)
