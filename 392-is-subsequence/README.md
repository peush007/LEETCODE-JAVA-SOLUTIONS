# 392. Is Subsequence

Problem Link:
https://leetcode.com/problems/is-subsequence/

---

## Problem

Given two strings `s` and `t`, return `true` if `s` is a subsequence of `t`, otherwise return `false`.

A subsequence is a sequence that can be derived from another string by deleting some characters without changing the order of the remaining characters.

---

## Approach (Two Pointers)

Use two pointers:

- `i` for string `s`
- `j` for string `t`

Traverse both strings:

1. If characters match, move both pointers.
2. Otherwise, move only the pointer of `t`.
3. If all characters of `s` are matched, return `true`.
4. Otherwise return `false`.

Example:

```text
s = "abc"
t = "ahbgdc"

a → match
b → match
c → match

Result = true
```

---

## Time Complexity

O(n)

where `n` is the length of `t`.

---

## Space Complexity

O(1)

No extra space is used.