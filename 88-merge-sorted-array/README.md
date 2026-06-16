# 88. Merge Sorted Array

Problem Link:
https://leetcode.com/problems/merge-sorted-array/

---

## Problem

Given two sorted integer arrays `nums1` and `nums2`, merge `nums2` into `nums1` as one sorted array.

---

## Approach

1. Use two pointers to traverse both arrays.
2. Compare elements and store the smaller one in a temporary array.
3. Copy remaining elements from either array.
4. Copy the merged array back into `nums1`.

---

## Time Complexity

O(m + n)

---

## Space Complexity

O(m + n)

An extra array is used to store the merged result.