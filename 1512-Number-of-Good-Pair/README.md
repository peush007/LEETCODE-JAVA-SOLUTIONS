# 1512. Number of Good Pairs

Problem Link:
https://leetcode.com/problems/number-of-good-pairs/

---

## Problem

Given an array `nums`, return the number of good pairs.

A pair `(i, j)` is good if:

- `nums[i] == nums[j]`
- `i < j`

---

## Approach (Brute Force)

1. Use two nested loops.
2. Compare every pair of elements.
3. If both values are equal, increment the counter.
4. Return the final count.

---

## Time Complexity

O(n²)

Every pair of elements is checked.

---

## Space Complexity

O(1)

No extra data structures are used.