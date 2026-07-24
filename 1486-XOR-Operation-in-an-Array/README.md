# 1486. XOR Operation in an Array

Problem Link:
https://leetcode.com/problems/xor-operation-in-an-array/

---

## Problem

Given two integers `n` and `start`, define an array where:

nums[i] = start + 2 × i

Return the bitwise XOR of all elements in the array.

---

## Approach

1. Initialize `ans = 0`.
2. Iterate from `0` to `n - 1`.
3. Compute each element using:
   `start + 2 × i`
4. XOR the element with `ans`.
5. Return `ans`.

---

## Time Complexity

O(n)

One traversal through the generated values.

---

## Space Complexity

O(1)

No extra array is created.