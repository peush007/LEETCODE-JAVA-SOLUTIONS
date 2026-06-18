# 74. Search a 2D Matrix

Problem Link:
https://leetcode.com/problems/search-a-2d-matrix/

---

## Problem

Given an `m x n` matrix and a target value, return `true` if the target exists in the matrix, otherwise return `false`.

---

## Approach (Binary Search)

The matrix can be treated as a sorted 1D array.

1. Apply Binary Search on indices from `0` to `rows * cols - 1`.
2. Convert the middle index into row and column:
   - `row = mid / cols`
   - `col = mid % cols`
3. Compare the element with the target.
4. Adjust the search range accordingly.

---

## Time Complexity

O(log(m × n))

---

## Space Complexity

O(1)