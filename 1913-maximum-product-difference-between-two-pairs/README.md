# 1913. Maximum Product Difference Between Two Pairs

## 🔗 Problem Link

https://leetcode.com/problems/maximum-product-difference-between-two-pairs/

---

## 📝 Problem

The product difference between two pairs `(a, b)` and `(c, d)` is:

`(a × b) - (c × d)`

Given an integer array `nums`, choose four distinct elements `w`, `x`, `y`, and `z` such that:

`(w × x) - (y × z)`

is maximized.

Return the maximum product difference.

---

## 💡 Approach (Sorting)

1. Sort the array in ascending order.
2. The two largest elements produce the maximum product.
3. The two smallest elements produce the minimum product.
4. Subtract the minimum product from the maximum product.
5. Return the result.

After sorting:

```text
smallest = nums[0]
second smallest = nums[1]

second largest = nums[n - 2]
largest = nums[n - 1]
```

Therefore:

```text
Answer = (largest × second largest)
       - (smallest × second smallest)
```



## ⏱ Time Complexity

Sorting the array takes:

**O(n log n)**

The remaining operations take:

**O(1)**

Therefore:

**Time Complexity = O(n log n)**

---

## 💾 Space Complexity

No additional array or collection is created.

**Space Complexity = O(1)** auxiliary space.

---

## 📚 Concepts Used

- Arrays
- Sorting
- Greedy Observation
- Finding Minimum Elements
- Finding Maximum Elements

---

## 🧠 Key Learning

After sorting the array, the maximum product is obtained using the two largest elements, while the minimum product is obtained using the two smallest elements.

Therefore, we can directly calculate the maximum product difference without checking every possible combination.