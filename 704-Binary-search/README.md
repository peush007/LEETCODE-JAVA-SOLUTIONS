# 704. Binary Search

Problem Link:
https://leetcode.com/problems/binary-search/

---

## Problem

Given a sorted array of integers `nums` and an integer `target`, return the index of `target`. If it does not exist, return `-1`.

---

## Approach

Since the array is sorted, we can use Binary Search.

1. Initialize two pointers:
   - `left = 0`
   - `right = nums.length - 1`

2. Find the middle element.

3. If the middle element equals the target, return its index.

4. If the target is smaller, search in the left half.

5. If the target is greater, search in the right half.

6. Repeat until the target is found or the search space becomes empty.

---

## Time Complexity

O(log n)

The search space is reduced by half in every iteration.

---

## Space Complexity

O(1)

No extra space is used.