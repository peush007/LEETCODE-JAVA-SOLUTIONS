# 1710. Maximum Units on a Truck

Problem Link:
https://leetcode.com/problems/maximum-units-on-a-truck/

---

## Problem

You are given different box types where:

- boxTypes[i][0] = number of boxes
- boxTypes[i][1] = units per box

Return the maximum total units that can be loaded onto the truck.

---

## Approach (Greedy)

1. Sort the box types in descending order of units per box.
2. Pick as many boxes as possible from the current type.
3. Continue until the truck is full.
4. Return the total units.

---

## Time Complexity

O(n log n)

Sorting dominates the running time.

---

## Space Complexity

O(1)

Only a few extra variables are used (excluding sorting).