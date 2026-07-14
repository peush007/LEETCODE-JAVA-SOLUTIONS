# 2798. Number of Employees Who Met the Target

Problem Link:
https://leetcode.com/problems/number-of-employees-who-met-the-target/

---

## Problem

You are given an integer array `hours`, where `hours[i]` represents the number of hours worked by the `iᵗʰ` employee, and an integer `target`.

Return the number of employees who worked at least `target` hours.

---

## Approach

We iterate through the `hours` array and count the employees whose working hours are greater than or equal to the target.

Algorithm:
1. Initialize `count` to `0`.
2. Traverse the array.
3. If `hours[i] >= target`, increment `count`.
4. Return `count`.

---

## Time Complexity

O(n)

The array is traversed exactly once.

---

## Space Complexity

O(1)

Only one integer variable is used.  