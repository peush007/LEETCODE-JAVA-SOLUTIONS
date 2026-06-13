# 20. Valid Parentheses

Problem Link:
https://leetcode.com/problems/valid-parentheses/

---

## Approach

Use a stack to store opening brackets.

- Push opening brackets into the stack.
- For a closing bracket, check if it matches the top of the stack.
- If it does not match, return false.
- At the end, the stack should be empty.

---

## Time Complexity

O(n)

---

## Space Complexity

O(n)