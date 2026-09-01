# 15. 3Sum

## 🔗 Problem Link

https://leetcode.com/problems/3sum/

---

## 📝 Problem

Given an integer array `nums`, return all the unique triplets `[nums[i], nums[j], nums[k]]` such that:

```text
nums[i] + nums[j] + nums[k] = 0
```

The solution must not contain duplicate triplets.

---

## 💡 Approach

We use **Sorting + Two Pointers + HashSet** to solve the problem.

For every element, we try to find two other elements whose sum with the current element is `0`.

1. First, check if the array contains fewer than 3 elements. If yes, return an empty list.

2. Sort the array in ascending order.

3. Use a loop to fix one element at index `i`.

4. Set two pointers:

   * `left = i + 1`
   * `right = nums.length - 1`

5. Calculate the sum of the three elements:

   ```text
   sum = nums[i] + nums[left] + nums[right]
   ```

6. If `sum == 0`, we found a valid triplet. Add it to the `HashSet`.

7. If `sum < 0`, move `left` forward because we need a larger sum.

8. If `sum > 0`, move `right` backward because we need a smaller sum.

9. The `HashSet` is used to avoid duplicate triplets.

10. Finally, convert the `HashSet` into an `ArrayList` and return the result.

---

## 🔑 Example

```text
Input:

nums = [-1, 0, 1, 2, -1, -4]
```

After sorting:

```text
[-4, -1, -1, 0, 1, 2]
```

Valid triplets:

```text
[-1, -1, 2]
[-1, 0, 1]
```

Because:

```text
-1 + -1 + 2 = 0

-1 + 0 + 1 = 0
```

Output:

```text
[[-1, -1, 2], [-1, 0, 1]]
```

---

## ⏱ Time Complexity

Sorting the array takes:

```text
O(n log n)
```

For every element, the two-pointer technique takes:

```text
O(n)
```

Since we repeat this for all elements:

**Time Complexity: O(n²)**

---

## 💾 Space Complexity

The `HashSet` is used to store unique triplets.

**Space Complexity: O(n)**

Additional space is required for storing the result.

---

## 📚 Concepts Used

* Arrays
* Sorting
* Two Pointers
* HashSet
* Nested Loops
* Searching
* Duplicate Handling

---

## 🧠 Key Learning

The main idea of the **3Sum** problem is to convert a three-element search into:

**One Fixed Element + Two Pointer Search**

After sorting the array, the two pointers can be moved intelligently depending on whether the current sum is smaller or larger than `0`.

The `HashSet` helps ensure that duplicate triplets are not added to the result.

---

## 🚀 Key Takeaway

This problem is a classic example of combining:

**Sorting + Two Pointers + Hashing**

It is an important pattern for solving problems involving pairs, triplets, and target sums efficiently.

---
