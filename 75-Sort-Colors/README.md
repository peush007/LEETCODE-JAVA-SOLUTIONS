# 75. Sort Colors

Problem Link:
https://leetcode.com/problems/sort-colors/

---

## Problem

Given an array containing only `0`, `1`, and `2`, sort the array in-place without using the library sort function.

---

## Approach (Dutch National Flag Algorithm)

Use three pointers:

- `zero` → Boundary for `0`s.
- `one` → Current index.
- `two` → Boundary for `2`s.

Algorithm:

1. If current element is `0`, swap it with `zero`.
2. If current element is `1`, move ahead.
3. If current element is `2`, swap it with `two`.

Repeat until `one > two`.

---

## Time Complexity

O(n)

Each element is processed at most once.

---

## Space Complexity

O(1)

The sorting is performed in-place.