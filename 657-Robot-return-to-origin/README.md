# 657. Robot Return to Origin

Problem Link:
https://leetcode.com/problems/robot-return-to-origin/

---

## Problem

A robot starts at the origin `(0, 0)`.

Given a string `moves`, where:

- `U` = Up
- `D` = Down
- `L` = Left
- `R` = Right

Determine whether the robot returns to the origin after performing all the moves.

---

## Approach

We keep track of the robot's vertical and horizontal movement.

1. Initialize two counters:
   - `ucount` for vertical movement.
   - `lcount` for horizontal movement.
2. Traverse each character in the string:
   - `U` → increment `ucount`
   - `D` → decrement `ucount`
   - `L` → increment `lcount`
   - `R` → decrement `lcount`
3. If both counters become zero after all moves, the robot has returned to the origin.

---

## Time Complexity

O(n)

The string is traversed exactly once.

---

## Space Complexity

O(1)

Only two integer variables are used.