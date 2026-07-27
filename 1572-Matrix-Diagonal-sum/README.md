# 1572. Matrix Diagonal Sum

Problem Link:
https://leetcode.com/problems/matrix-diagonal-sum/

---

## Problem

Given a square matrix `mat`, return the sum of its primary and secondary diagonals.

If the matrix has an odd size, the center element should only be counted once.

---

## Approach

1. Traverse each row.
2. Add the primary diagonal element `mat[i][i]`.
3. Add the secondary diagonal element `mat[i][n - 1 - i]`.
4. Avoid double-counting the center element.
5. Return the total sum.

---

## Time Complexity

O(n)

One traversal of the matrix diagonals.

---

## Space Complexity

O(1)

Only one variable is used to store the sum.