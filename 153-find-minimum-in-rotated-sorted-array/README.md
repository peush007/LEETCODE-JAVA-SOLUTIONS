# 153. Find Minimum in Rotated Sorted Array

## 🔗 Problem Link

https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

---

## 📝 Problem

Suppose an array of distinct integers is sorted in ascending order and then rotated between `1` and `n` times.

Return the minimum element of the rotated sorted array.

---

## 💡 Approach (Linear Search)

1. Initialize the minimum element with the first value.
2. Traverse the array.
3. Update the minimum whenever a smaller element is found.
4. Return the minimum element.


---

## ⏱ Time Complexity

**O(n)**

The array is traversed once.

---

## 💾 Space Complexity

**O(1)**

Only one extra variable is used.

---

## 📚 Concepts Used

- Arrays
- Linear Search

---

## 🚀 Note

This solution is correct and passes all test cases.

However, the optimal interview solution uses **Binary Search** to achieve **O(log n)** time complexity by taking advantage of the rotated sorted array property.