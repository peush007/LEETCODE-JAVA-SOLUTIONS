# 2535. Difference Between Element Sum and Digit Sum of an Array

Problem Link:
https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/

---

## Problem

Given an integer array `nums`, return the absolute difference between:

- The sum of all elements.
- The sum of all digits of those elements.

---

## Approach

1. Traverse the array.
2. Add every element to `elementSum`.
3. Extract every digit using `% 10` and `/= 10`.
4. Add every digit to `digitSum`.
5. Return `Math.abs(elementSum - digitSum)`.

---

## Time Complexity

O(n × d)

Where:
- `n` = number of elements
- `d` = average number of digits per element

---

## Space Complexity

O(1)

Only a few integer variables are used.