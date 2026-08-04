# 191. Number of 1 Bits

## Problem Link

https://leetcode.com/problems/number-of-1-bits/

---

## Problem

Given a positive integer `n`, return the number of set bits (`1`s) in its binary representation.

---

## Approach (Brian Kernighan's Algorithm)

1. Initialize a counter.
2. While `n != 0`:
   - Remove the rightmost set bit using:
     `n = n & (n - 1)`
   - Increment the counter.
3. Return the counter.

---

## Time Complexity

O(k)

Where `k` is the number of set bits.

---

## Space Complexity

O(1)

Only a few integer variables are used.