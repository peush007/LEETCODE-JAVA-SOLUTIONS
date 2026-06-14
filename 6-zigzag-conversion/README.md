# 6. Zigzag Conversion

**Difficulty:** Medium
**Link:** https://leetcode.com/problems/zigzag-conversion/

## Problem
Given a string `s` and an integer `numRows`, write the string in a zigzag pattern across `numRows` rows (like the letters were arranged diagonally), then read the rows left to right to produce the output string.

## Approach
1. Handle the edge case where `numRows == 1` or `numRows >= s.length()` — in this case, return the string as-is.
2. Create an array of `numRows` strings, one for each row of the zigzag pattern.
3. Traverse the input string in two phases using a single pointer `i`:
   - **Downward phase:** Move from row `0` to row `numRows - 1`, appending characters along the way.
   - **Upward (diagonal) phase:** Move from row `numRows - 2` back up to row `1`, appending characters along the way.
4. Repeat both phases until the entire string is consumed.
5. Concatenate all rows together to get the final result.

## Example
For `s = "PAYPALISHIRING"`, `numRows = 3`:

Output: `"PAHNAPLSIIGYIR"`

## Complexity
- **Time Complexity:** O(n) — each character is visited exactly once.
- **Space Complexity:** O(n) — extra space used to store the rows before joining.

## Edge Cases
- `numRows == 1` → return the string as-is (no zigzag possible).
- `numRows >= s.length()` → return the string as-is (each character would go to its own row, in order).