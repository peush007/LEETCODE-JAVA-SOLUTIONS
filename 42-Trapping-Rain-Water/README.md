# 42. Trapping Rain Water

Problem Link:
https://leetcode.com/problems/trapping-rain-water/

---

## Problem

Given an array `height` representing the elevation map, compute how much water can be trapped after raining.

---

## Approach (Prefix & Suffix Maximum)

1. Build `leftMax[]` where each element stores the maximum height from the left.
2. Build `rightMax[]` where each element stores the maximum height from the right.
3. For every index:
   - Water level = min(leftMax[i], rightMax[i])
   - Trapped water = Water level - height[i]
4. Sum all trapped water.

---

## Time Complexity

O(n)

Three linear traversals are performed.

---

## Space Complexity

O(n)

Two extra arrays (`leftMax` and `rightMax`) are used.