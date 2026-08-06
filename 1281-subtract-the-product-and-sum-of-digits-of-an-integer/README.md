# 1281. Subtract the Product and Sum of Digits of an Integer

## 🔗 Problem Link

https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

---

## 📝 Problem

Given an integer `n`, return the difference between the product of its digits and the sum of its digits.

---

## 💡 Approach

1. Initialize `product = 1` and `sum = 0`.
2. Extract each digit using `n % 10`.
3. Multiply the digit into `product`.
4. Add the digit to `sum`.
5. Remove the last digit using `n / 10`.
6. Return `product - sum`.


---

## ⏱ Time Complexity

**O(d)**

Where `d` is the number of digits in the integer.

---

## 💾 Space Complexity

**O(1)**

Only a few integer variables are used.

---

## 📚 Concepts Used

- Math
- Digit Extraction
- Modulo (`%`)
- Integer Division (`/`)