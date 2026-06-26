# 2965. Find Missing and Repeated Values

Problem Link:
https://leetcode.com/problems/find-missing-and-repeated-values/

---

## Problem

You are given an `n x n` grid containing integers from `1` to `n²`.

Exactly one number appears twice, and one number is missing.

Return an array where:
- The first element is the repeated number.
- The second element is the missing number.

---

## Approach (Frequency Array)

We use a frequency array to count how many times each number appears.

1. Create a frequency array of size `n² + 1`.
2. Traverse the grid and increment the frequency of each value.
3. Traverse the frequency array:
   - If a number appears twice, it is the repeated value.
   - If a number never appears, it is the missing value.
4. Return both values.

---

## Time Complexity

O(n²) – We traverse the grid once and then scan the frequency array.

---

## Space Complexity

O(n²) – A frequency array of size `n² + 1` is used.