# 2769. Find the Maximum Achievable Number

Problem Link:
https://leetcode.com/problems/find-the-maximum-achievable-number/

---

## Problem

Given two integers `num` and `t`, return the maximum achievable number after performing at most `t` operations.

---

## Approach

Each operation effectively increases the achievable number by `2`.

Therefore:

Maximum Achievable Number = `num + (2 × t)`

Return the computed value.

---

## Time Complexity

O(1)

Only one arithmetic operation is performed.

---

## Space Complexity

O(1)

No extra space is used.