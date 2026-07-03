# 912. Sort an Array

Problem Link:
https://leetcode.com/problems/sort-an-array/

---

## Problem

Given an integer array `nums`, sort the array in ascending order and return it.

You must solve the problem without using any built-in sorting functions.

---

## Approach (Merge Sort)

Merge Sort is a divide-and-conquer algorithm.

1. Divide the array into two halves.
2. Recursively sort both halves.
3. Merge the two sorted halves into a single sorted array.

The merge step compares elements from both temporary arrays and places them back into the original array in sorted order.

---

## Time Complexity

O(n log n)

- Dividing the array takes `log n` levels.
- Merging all elements at each level takes `O(n)`.

Overall:

**O(n log n)**

---

## Space Complexity

O(n)

Additional temporary arrays are used during the merge process.