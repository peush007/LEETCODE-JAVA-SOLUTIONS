# 35. Search Insert Position

Problem Link:
https://leetcode.com/problems/search-insert-position/

---

## Problem

Given a sorted array of distinct integers and a target value, return its index if found. Otherwise, return the index where it would be inserted.

---

## Approach

Since the array is sorted, we can use Binary Search.

1. Find the middle element.
2. If target is found, return its index.
3. If target is smaller, search the left half.
4. If target is greater, search the right half.
5. If the target is not found, return `left` as the insertion position.

---

## Time Complexity

O(log n)

---

## Space Complexity

O(1)