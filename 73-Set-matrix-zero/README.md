# 73. Set Matrix Zeroes

Problem Link:
https://leetcode.com/problems/set-matrix-zeroes/

---

## Problem

Given an `m × n` matrix, if an element is `0`, set its entire row and column to `0`.

The operation must be performed in-place.

---

## Approach (Row & Column Marker Arrays)

We use two boolean arrays to remember which rows and columns contain a zero.

1. Create a boolean array for rows.
2. Create a boolean array for columns.
3. Traverse the matrix:
   - If an element is `0`, mark its row and column.
4. Traverse the matrix again:
   - If the current row or column is marked, set the element to `0`.

This avoids modifying the matrix while still detecting all original zeroes.

---

## Time Complexity

O(m × n)

We traverse the matrix twice.

---

## Space Complexity

O(m + n)

Two boolean arrays are used to store marked rows and columns.
