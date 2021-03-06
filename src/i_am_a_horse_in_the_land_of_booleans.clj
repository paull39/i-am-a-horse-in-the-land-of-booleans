;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< 0 x) x (* x -1)))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n)  "gotcha!"
    (divides? 3 n)   "fizz"
    (divides? 5 n)   "buzz"
    :else            ""))

(defn teen? [age]
  (< 12 age 20 ))

(defn not-teen? [age]
  (not(teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x)   (* 2 x)
    (empty? x)    nil
    (or (list? x)(vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [year]
    (and (divides? 4 year) (or (not (divides? 100 year)) (divides? 400 year))))
