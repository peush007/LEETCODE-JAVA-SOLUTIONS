# 2. Add Two Numbers

## 🔗 Problem Link

https://leetcode.com/problems/add-two-numbers/

---

## 📝 Problem

You are given two non-empty linked lists representing two non-negative integers.

The digits are stored in **reverse order**, and each node contains a single digit.

Add the two numbers and return the sum as a linked list.

---

## 💡 Approach

We traverse both linked lists simultaneously and add their corresponding digits.

For every position:

1. Get the digit from `l1`.
2. Get the digit from `l2`.
3. Add both digits along with the `carry`.
4. Store `sum % 10` as the current digit.
5. Update the carry using `sum / 10`.
6. Move both pointers to their next nodes.
7. Continue until both lists are completely processed and there is no remaining carry.

A **dummy node** is used to simplify the construction of the result linked list.

---

## 🔑 Example

```text
l1 = 2 → 4 → 3
l2 = 5 → 6 → 4

342 + 465 = 807

Result:
7 → 0 → 8
```



## ⏱ Time Complexity

Let `n` be the maximum length of the two linked lists.

Each node is processed once.

**Time Complexity: O(max(n, m))**

---

## 💾 Space Complexity

The result linked list contains up to `O(max(n, m))` nodes.

**Space Complexity: O(max(n, m))**

---

## 📚 Concepts Used

- Linked List
- Two Pointers
- Carry Handling
- Dummy Node
- Linked List Traversal
- Mathematical Addition

---

## 🧠 Key Learning

The digits are stored in reverse order, so we can add them directly from the head of each linked list.

The two important operations are:

```text
digit = sum % 10
carry = sum / 10
```

A dummy node makes it easier to construct the resulting linked list.

---

## 🚀 Key Takeaway

This problem is a classic example of combining:

**Linked List Traversal + Carry-Based Addition**

Understanding this pattern is useful for many linked-list and number-manipulation problems.