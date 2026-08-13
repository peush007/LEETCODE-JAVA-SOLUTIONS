# 832. Flipping an Image

## 🔗 Problem Link

https://leetcode.com/problems/flipping-an-image/

---

## 📝 Problem

Given an `n x n` binary matrix `image`, flip the image horizontally and then invert it.

To flip the image horizontally, reverse each row.

To invert the image, replace:

- `0` with `1`
- `1` with `0`

Return the resulting image.

---

## 💡 Approach

The solution performs two operations on every row:

### 1. Flip the Row

Use two pointers:

- `left` starts from the beginning.
- `right` starts from the end.

Swap the elements while:

```text
left <= right
```

### 2. Invert the Row

After reversing the row, traverse it again and replace each value using:

```java
image[i][j] = 1 - image[i][j];
```

This changes:

```text
0 → 1
1 → 0
```

## 🔍 Example

### Input

```text
[
  [1,1,0],
  [1,0,1],
  [0,0,0]
]
```

### After flipping

```text
[
  [0,1,1],
  [1,0,1],
  [0,0,0]
]
```

### After inverting

```text
[
  [1,0,0],
  [0,1,0],
  [1,1,1]
]
```

### Output

```text
[
  [1,0,0],
  [0,1,0],
  [1,1,1]
]
```

---

## ⏱ Time Complexity

Every element of the matrix is processed.

**Time Complexity: O(m × n)**

Where:

- `m` = number of rows
- `n` = number of columns

---

## 💾 Space Complexity

The matrix is modified **in-place**.

**Space Complexity: O(1)**

---

## 📚 Concepts Used

- 2D Arrays
- Matrix Traversal
- Two Pointers
- In-Place Modification
- Array Reversal
- Bit Inversion

---

## 🧠 Key Learning

A matrix problem can often be solved efficiently by modifying the matrix **in-place** instead of creating another matrix.

The two-pointer technique allows each row to be reversed efficiently, while:

```java
1 - image[i][j]
```

efficiently inverts each binary value.