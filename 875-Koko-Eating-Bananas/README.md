# 875. Koko Eating Bananas

Problem Link:
https://leetcode.com/problems/koko-eating-bananas/

---

## Problem

Koko loves bananas. Given an array `piles` where each pile contains bananas and an integer `h`, return the minimum eating speed `k` such that Koko can eat all bananas within `h` hours.

---

## Approach (Binary Search on Answer)

The answer lies between:

- Minimum speed = 1
- Maximum speed = largest pile

For each speed:

1. Calculate the total hours needed.
2. If hours ≤ h, try a smaller speed.
3. Otherwise, increase the speed.

The first valid speed is the answer.

---

## Time Complexity

O(n log m)

Where:
- n = number of piles
- m = maximum pile size

---

## Space Complexity

O(1)