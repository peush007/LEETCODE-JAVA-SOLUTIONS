# 414. Third Maximum Number

Problem Link:
https://leetcode.com/problems/third-maximum-number/

---

## Problem

Given an integer array `nums`, return the third distinct maximum number in the array. If the third distinct maximum does not exist, return the maximum number.

---

## Approach (Sorting)

1. Sort the array in ascending order.
2. Traverse the array from right to left.
3. Count distinct elements.
4. Return the third distinct maximum when found.
5. If fewer than three distinct values exist, return the maximum element.

---

## Time Complexity

O(n log n)

Sorting the array dominates the running time.

---

## Space Complexity

O(1)

No extra data structures are created (excluding the sorting algorithm's internal implementation).