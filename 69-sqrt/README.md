# 69. Sqrt(x)

Problem Link:
https://leetcode.com/problems/sqrtx/

---

## Problem

Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer.

---

## Approach (Binary Search)

The square root lies between `0` and `x`.

1. Apply Binary Search on the range `[0, x]`.
2. Calculate `mid * mid`.
3. If equal to `x`, return `mid`.
4. If smaller than `x`, store `mid` as a possible answer and search right.
5. If greater than `x`, search left.
6. Return the last valid answer.

---

## Time Complexity

O(log x)

---

## Space Complexity

O(1)