# 11. Container With Most Water

Problem Link:
https://leetcode.com/problems/container-with-most-water/

---

## Problem

Given an integer array `height`, where each element represents the height of a vertical line, find two lines that together with the x-axis form a container capable of holding the maximum amount of water.

Return the maximum amount of water that can be stored.

---

## Approach (Two Pointer Technique)

We place two pointers at the beginning and end of the array.

1. Calculate the width between the two pointers.
2. The container height is determined by the smaller of the two heights.
3. Compute the area and update the maximum area found so far.
4. Move the pointer with the smaller height inward.
5. Continue until both pointers meet.

Moving the smaller height pointer is important because the current area is limited by that height, and moving the taller pointer cannot increase the area.

---

## Time Complexity

O(n) – Each element is visited at most once.

---

## Space Complexity

O(1) – No extra space is used.