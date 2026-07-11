# 560. Subarray Sum Equals K

Problem Link:
https://leetcode.com/problems/subarray-sum-equals-k/

---

## Problem

Given an integer array `nums` and an integer `k`, return the total number of continuous subarrays whose sum equals `k`.

---

## Approach (Prefix Sum + HashMap)

We maintain a running prefix sum while traversing the array.

1. Initialize a HashMap to store the frequency of prefix sums.
2. Insert `(0,1)` into the map to handle subarrays starting from index `0`.
3. For each element:
   - Add it to the prefix sum.
   - Check if `(prefixSum - k)` exists in the map.
   - If it exists, add its frequency to the answer.
   - Store the current prefix sum in the map.
4. Return the total count.

---

## Time Complexity

O(n)

The array is traversed once, and each HashMap operation takes O(1) on average.

---

## Space Complexity

O(n)

The HashMap may store up to `n` different prefix sums.