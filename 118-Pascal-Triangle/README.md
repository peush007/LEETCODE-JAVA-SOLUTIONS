# 118. Pascal's Triangle

Problem Link:
https://leetcode.com/problems/pascals-triangle/

---

## Problem

Given an integer `numRows`, return the first `numRows` of Pascal's Triangle.

In Pascal's Triangle:

- The first and last element of every row is `1`.
- Every other element is the sum of the two numbers directly above it.

---

## Approach

1. Create an empty answer list.
2. Generate each row one by one.
3. The first and last element of every row is `1`.
4. For every middle element:
   - Add the two corresponding elements from the previous row.
5. Store each row in the answer list.

---

## Time Complexity

O(n²)

There are approximately `n(n+1)/2` elements generated.

---

## Space Complexity

O(n²)

The output list stores all rows of Pascal's Triangle.