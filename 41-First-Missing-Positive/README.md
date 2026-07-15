# 41. First Missing Positive

Problem Link:
https://leetcode.com/problems/first-missing-positive/

---

## Problem

Given an unsorted integer array `nums`, return the smallest missing positive integer.

You must implement an algorithm that runs in **O(n)** time and uses **O(1)** extra space.

---

## Approach (Index Marking)

The smallest missing positive number must lie in the range `[1, n + 1]`, where `n` is the array length.

### Steps

1. Replace all negative numbers, zeros, and values greater than `n` with `n + 1`.
2. Traverse the array again:
   - For every value `x` in `[1, n]`, mark index `x - 1` as negative.
3. Traverse the array one final time:
   - The first positive index `i` indicates that `i + 1` is missing.
4. If every index is marked, return `n + 1`.

---

## Time Complexity

O(n)

The array is traversed three times, which is still linear.

---

## Space Complexity

O(1)

The array itself is modified without using any extra data structures.