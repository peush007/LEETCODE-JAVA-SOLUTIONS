# 3019. Number of Changing Keys

Problem Link:
https://leetcode.com/problems/number-of-changing-keys/

---

## Problem

Given a string `s` representing keys pressed on a keyboard, return the number of times the pressed key changes.

Uppercase and lowercase versions of the same letter are considered identical.

---

## Approach

1. Initialize a counter.
2. Traverse the string from left to right.
3. Compare each character with the next one after converting both to lowercase.
4. If they are different, increment the counter.
5. Return the counter.

---

## Time Complexity

O(n)

The string is traversed once.

---

## Space Complexity

O(1)

Only one integer variable is used.