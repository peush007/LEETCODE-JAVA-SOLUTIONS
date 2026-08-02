# 162. Find Peak Element

Problem Link:
https://leetcode.com/problems/find-peak-element/

---

## Problem

Given an integer array `nums`, find a peak element and return its index.

A peak element is greater than its adjacent elements.

---

## Approach (Binary Search)

1. Initialize `low` and `high`.
2. Compute the middle index.
3. Compare `nums[mid]` with `nums[mid + 1]`.
4. If the right element is larger, search the right half.
5. Otherwise, search the left half including `mid`.
6. Continue until `low == high`.
7. Return the index.

---

## Time Complexity

O(log n)

Binary Search halves the search space every iteration.

---

## Space Complexity

O(1)

Only a few integer variables are used.