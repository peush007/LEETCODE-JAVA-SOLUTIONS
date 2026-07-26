# 1464. Maximum Product of Two Elements in an Array

Problem Link:
https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

---

## Problem

Given an integer array `nums`, choose two different indices `i` and `j`.

Return the maximum value of:

(nums[i] - 1) × (nums[j] - 1)

---

## Approach (Brute Force)

1. Compare every possible pair.
2. Compute the product for each pair.
3. Keep track of the maximum product.
4. Return the maximum.

---

## Time Complexity

O(n²)

All pairs are checked.

---

## Space Complexity

O(1)

No extra data structures are used.