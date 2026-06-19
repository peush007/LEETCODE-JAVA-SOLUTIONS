# 141. Linked List Cycle

Problem Link:
https://leetcode.com/problems/linked-list-cycle/

---

## Problem

Given the head of a linked list, determine if the linked list has a cycle.

---

## Approach (Fast & Slow Pointer)

Use two pointers:

- Slow pointer moves one step at a time.
- Fast pointer moves two steps at a time.

If a cycle exists, both pointers will eventually meet.

If the fast pointer reaches the end of the list, no cycle exists.

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)