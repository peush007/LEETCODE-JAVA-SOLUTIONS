# 2586. Count the Number of Vowel Strings in Range

Problem Link:
https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/

---

## Problem

Given an array of strings `words` and two integers `left` and `right`, count how many strings in the range `[left, right]` both start and end with a vowel.

---

## Approach

1. Traverse the array from `left` to `right`.
2. Extract the first and last character of each word.
3. Check whether both characters are vowels.
4. Count such words and return the result.

---

## Time Complexity

O(n)

Where `n = right - left + 1`.

---

## Space Complexity

O(1)

Only a few variables are used.