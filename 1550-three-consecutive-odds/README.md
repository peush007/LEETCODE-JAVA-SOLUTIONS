# 1550. Three Consecutive Odds

Problem Link:
https://leetcode.com/problems/three-consecutive-odds/

---

## Problem

Given an integer array `arr`, return `true` if there are three consecutive odd numbers in the array. Otherwise, return `false`.

---

## Approach

1. Traverse the array once.
2. Count consecutive odd numbers.
3. Reset the count whenever an even number is found.
4. Return `true` as soon as three consecutive odd numbers are found.

---

## Time Complexity

O(n)

The array is traversed only once.

---

## Space Complexity

O(1)

Only one extra variable is used.