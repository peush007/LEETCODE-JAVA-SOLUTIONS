# 24. Swap Nodes in Pairs

Problem Link:
https://leetcode.com/problems/swap-nodes-in-pairs/

---

## Problem

Given the head of a linked list, swap every two adjacent nodes and return its head.

You must solve the problem without modifying the values in the list's nodes.

---

## Approach (Iterative)

1. Create a dummy node pointing to the head.
2. Use a pointer `temp` to track the node before the pair.
3. While two nodes are available:
   - Store the two nodes.
   - Adjust their `next` pointers to swap them.
   - Connect the previous node to the swapped pair.
   - Move `temp` to the end of the swapped pair.
4. Return `dummy.next`.

---

## Time Complexity

O(n)

Each node is visited once.

---

## Space Complexity

O(1)

Only a few pointer variables are used.