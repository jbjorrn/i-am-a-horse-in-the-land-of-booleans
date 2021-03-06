(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (cond
    (= x nil) false
    (= x false) false
    :else true
   ))

(defn abs [x]
  (if (> x 0) x (* -1 x)))


(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond
    (divides? n 15) "gotcha!"
    (divides? n 5) "buzz"
    (divides? n 3) "fizz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
      (empty? x) nil
       (or (list? x) (vector? x)) (* 2 (count x))
     :else true))

(defn leap-year? [year]
  (cond
    (divides? 400 year) true
    (divides? 100 year) false
    (divides? 4 year) true
    :else false))

; '_______'
