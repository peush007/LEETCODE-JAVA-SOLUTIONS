# 1051. Height Checker

## 🔗 Problem Link

https://leetcode.com/problems/height-checker/

---

## 📝 Problem

A school wants to take a photo of all the students standing in a line.

The students are currently standing in a certain order.

Return the number of indices where the current order differs from the expected order.

---

## 💡 Approach (Sorting + Comparison)

1. Create a copy of the original `heights` array.
2. Sort the copied array.
3. The sorted array represents the expected order.
4. Compare the original array with the sorted array.
5. Count the positions where the values are different.
6. Return the count.

---

## ⏱ Time Complexity

Sorting the copied array takes:

**O(n log n)**

The comparison takes:

**O(n)**

Therefore:

**Time Complexity = O(n log n)**

---

## 💾 Space Complexity

A copy of the array is created:

**Space Complexity = O(n)**

---

## 📚 Concepts Used

- Arrays
- Array Cloning
- Sorting
- Array Comparison

---

## 🧠 Key Learning

The sorted version of the array represents the expected order.

By comparing the original array with the sorted array, we can count exactly how many positions contain a different height.