# 1552. Magnetic Force Between Two Balls

Problem Link:
https://leetcode.com/problems/magnetic-force-between-two-balls/

---

## Problem

Given the positions of baskets and `m` balls, place the balls in the baskets such that the minimum distance between any two balls is maximized.

Return the maximum possible minimum distance.

---

## Approach (Binary Search on Answer)

1. Sort the basket positions.
2. Perform binary search on the possible minimum distance.
3. For each candidate distance:
   - Greedily place balls while maintaining at least that distance.
   - If all balls can be placed, try a larger distance.
   - Otherwise, reduce the distance.
4. The largest feasible distance is the answer.

---

## Time Complexity

O(n log n + n log D)

- Sorting the positions takes `O(n log n)`.
- Binary search performs `log D` iterations, where `D` is the maximum possible distance.
- Each feasibility check takes `O(n)`.

---

## Space Complexity

O(1)

Only a few extra variables are used (excluding the sorting algorithm's internal space).