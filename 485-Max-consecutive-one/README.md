# 485. Max Consecutive Ones

Problem Link:
https://leetcode.com/problems/max-consecutive-ones/

---

## Problem

Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

---

## Approach

We traverse the array while maintaining two variables:

- `count` stores the current consecutive count of `1`s.
- `max` stores the maximum consecutive count found so far.

Algorithm:
1. Traverse the array.
2. If the current element is `1`, increment `count`.
3. Update `max` with the maximum of `max` and `count`.
4. If the current element is `0`, reset `count` to `0`.
5. Return `max`.

---

## Time Complexity

O(n)

The array is traversed exactly once.

---

## Space Complexity

O(1)

Only two integer variables are used.