# 28. Find the Index of the First Occurrence in a String

Problem Link:
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

---

## Problem

Given two strings `haystack` and `needle`, return the index of the first occurrence of `needle` in `haystack`. If `needle` is not present, return `-1`.

---

## Approach

1. Traverse all possible starting positions in `haystack`.
2. Compare characters of `needle` one by one.
3. If all characters match, return the starting index.
4. If no match is found, return `-1`.

---

## Time Complexity

O(n × m)

Where:
- n = length of haystack
- m = length of needle

---

## Space Complexity

O(1)

No extra space is used.