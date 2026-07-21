# 53. Maximum Subarray

Problem Link:
https://leetcode.com/problems/maximum-subarray/

---

## Problem

Given an integer array `nums`, find the contiguous subarray with the largest sum and return its sum.

---

## Approach (Kadane's Algorithm)

Kadane's Algorithm maintains two variables:

- `cs` (Current Sum)
- `ms` (Maximum Sum)

Algorithm:

1. Add the current element to `cs`.
2. Update `ms` if `cs` is greater.
3. If `cs` becomes negative, reset it to `0`.
4. Return `ms`.

---

## Time Complexity

O(n)

The array is traversed exactly once.

---

## Space Complexity

O(1)

Only two integer variables are used.