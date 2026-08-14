# 3345. Smallest Divisible Digit Product I

## 🔗 Problem Link

https://leetcode.com/problems/smallest-divisible-digit-product-i/

---

## 📝 Problem

Given two positive integers `n` and `t`, return the smallest number greater than or equal to `n` such that the product of its digits is divisible by `t`.

---

## 💡 Approach

Use a simple search starting from `n`.

For each number:

1. Calculate the product of all its digits.
2. Check whether the digit product is divisible by `t`.
3. If it is divisible, return the current number.
4. Otherwise, increment the number and continue searching.

Digits are extracted using the modulo and integer division operations:

- `% 10` → extracts the last digit.
- `/ 10` → removes the last digit.


## ⏱ Time Complexity

Let:

- `k` = number of candidate numbers checked
- `d` = number of digits in each candidate

For each candidate, we process all its digits.

**Time Complexity: O(k × d)**

---

## 💾 Space Complexity

Only a few integer variables are used.

**Space Complexity: O(1)**

---

## 📚 Concepts Used

- Math
- Number Manipulation
- Digit Extraction
- Modulo Operator
- Integer Division
- Brute Force

---

## 🧠 Key Learning

A number's digits can be processed individually using:

```text
digit = num % 10
num = num / 10
```

The product of all digits can then be checked for divisibility by `t`.

The solution searches from `n` upward and returns the first valid number, which guarantees that the smallest valid number is found.

---

