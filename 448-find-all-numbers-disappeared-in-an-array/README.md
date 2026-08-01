# 448. Find All Numbers Disappeared in an Array

Problem Link:
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

---

## Problem

Given an integer array `nums` where `1 ≤ nums[i] ≤ n`, return all the numbers in the range `[1, n]` that do not appear in the array.

---

## Approach (In-Place Hashing)

1. Traverse the array.
2. For each value `x`, mark index `x - 1` as visited by making it negative.
3. Traverse the array again.
4. Any positive value indicates its corresponding number is missing.
5. Return the list of missing numbers.

---

## Time Complexity

O(n)

Two linear traversals.

---

## Space Complexity

O(1)

No extra data structure is used (excluding the output list).