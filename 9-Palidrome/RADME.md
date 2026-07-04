# 9. Palindrome Number

Problem Link:
https://leetcode.com/problems/palindrome-number/

---

## Problem

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A palindrome number reads the same forward and backward.

---

## Approach

1. Negative numbers cannot be palindromes, so return `false`.
2. Store the original number.
3. Reverse the digits of the number.
4. Compare the reversed number with the original number.
5. If both are equal, return `true`; otherwise, return `false`.

---

## Time Complexity

O(log n)

The loop processes each digit exactly once.

---

## Space Complexity

O(1)

Only a few integer variables are used.