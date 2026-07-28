# Maximum Product of Two Digits

## Problem

Given an integer `n`, find the product of the two largest digits.

---

## Approach

1. Traverse every digit of the number.
2. Maintain the largest (`max1`) and second largest (`max2`) digits.
3. Return `max1 * max2`.

---

## Time Complexity

O(d)

where `d` is the number of digits.

---

## Space Complexity

O(1)