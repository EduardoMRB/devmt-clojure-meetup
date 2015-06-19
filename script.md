# Script

## Clojure
- Quickly ask the audience about the languages they use
- Talk briefly about LISP

## What is Clojure?
- Explain how Clojure runs on different environments

## Syntax
- Cite Jonh McCarthy's paper: Recursive Functions of Symbolic Expressions and
    Their Computation by Machine
- Operators can be:
    - Something that resolves to a function
    - Macro
    - Special form

## Homoiconicity
- Clojure code is written with data stuctures: lists, vectors, etc
- Explain how this factor is fundamental for the language flexibility
- Touch briefly on macros

## Special forms in Clojure and Ruby
- Explain each of the special forms
    - How to bind global vars
    - Simple conditional with `if`
    - Multiple forms returning one value `do`
    - Local bindings with `let`
    - One way to create functions `fn`
    - Exception handling `throw` `try`
    - Clojure's approach to recursion `loop` `recur`
- Enphasize on the difference between the amount of special forms in both langs
- Why Ruby has less special forms than Java?
    - Explain why arithimetic operators are not in the list

## Syntax demo
- Show how to invoke functions, special forms and macros
- How to create anonnymous functions
- Use `apply`
- Using `quote` to create lists and vectors of not binded symbols

## Tipos de dados

### Literais
- Numbers are:
    - `Long`s by default
    - `Double`s by default
    - Autopromoted to `BigInt` or `BigDecimal`
- Strings are:
    - `java.lang.String`
    - They have all the methods of `String`
- Characters are:
    - `java.lang.Character`
    - Share all methods of `Character`
- Symbols
    - Binded to values or itself
- Keywords
    - Returns itself
    - Reads as itself
    - Equality is fast
    - Useful as keys of `Maps`
    - Behaves as functions to maps

### Non Atomics
- Lists
    - Clojure code is written in terms of them
    - Literal lists must be `quote`d
    - Fast operation on `first` and `rest`
    - Elements are added in front
- Vectors
    - Numerically indexed
    - Fast lookup operations (by index)
- Maps
    - Key/value structure
    - Maps behaves as functions of their keys
        - `({:a "v"} :a) => "v"`
    - Anything can be a key
    - Anything can be a value
- Sets
    - Distinct elements
    - Non distinct elements on literal construction throws error

## Immutability

- All data types are immutable by default
- Referencial transparency
- Naive implementations of immutable data structures destroys performance

## Persistent Data Structures

- All common data is shared

## Data types demo

- Show every data type in action
- Maps and keywords as functions

## Functions

## Sequences

- `clojure.lang.Seqable`
    - first
    - rest
    - next
    - cons
