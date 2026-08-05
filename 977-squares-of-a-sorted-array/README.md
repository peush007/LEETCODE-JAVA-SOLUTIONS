# 977. Squares of a Sorted Array

## 🔗 Problem Link

https://leetcode.com/problems/squares-of-a-sorted-array/

---

## 📝 Problem

Given an integer array `nums` sorted in **non-decreasing order**, return an array of the squares of each number, also sorted in **non-decreasing order**.

---

## 💡 Approach (Square + Sort)

1. Traverse the array.
2. Square each element.
3. Sort the array.
4. Return the sorted squared array.

---

## ✅ Solution

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}
```

---

## ⏱ Time Complexity

- Squaring all elements: **O(n)**
- Sorting the array: **O(n log n)**

**Overall Time Complexity:** **O(n log n)**

---

## 💾 Space Complexity

**O(1)** (excluding the space used internally by Java's sorting algorithm)

---

## 📚 Concepts Used

- Arrays
- Sorting

---

## 🚀 Note

This solution is correct and passes all test cases.

