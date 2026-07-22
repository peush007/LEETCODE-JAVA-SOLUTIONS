# 70. Climbing Stairs

Problem Link:
https://leetcode.com/problems/climbing-stairs/

---

## Problem

You are climbing a staircase with `n` steps.

Each time you can climb either:

- 1 step
- 2 steps

Return the total number of distinct ways to reach the top.

---

## Approach (Dynamic Programming)

The number of ways to reach a step depends on the previous two steps.

Formula:

ways(i) = ways(i - 1) + ways(i - 2)

Instead of storing all values, keep only the previous two results.

---

## Time Complexity

O(n)

One traversal from 3 to n.

---

## Space Complexity

O(1)

Only three integer variables are used.