# 149. Max Points on a Line

## 🔗 Problem Link

https://leetcode.com/problems/max-points-on-a-line/

---

## 📝 Problem

Given an array of points where `points[i] = [xi, yi]` represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.

---

## 💡 Approach

The solution uses **HashMap + Slope Normalization + GCD**.

For every point:

1. Treat the current point as the reference point.
2. Compare it with every other point.
3. Calculate the difference in coordinates:
   - `dx = x2 - x1`
   - `dy = y2 - y1`
4. Use GCD to reduce the slope to its simplest form.
5. Store the normalized slope in a `HashMap`.
6. The slope occurring most frequently represents the maximum number of points on the same line through the current point.
7. Repeat this for every point.

---

## 🔑 Slope Normalization

To avoid treating equivalent slopes as different:

```text
2/4 → 1/2
3/6 → 1/2
4/8 → 1/2
```

GCD is used to reduce `dy` and `dx` to their simplest form.

The normalized slope is stored as:

```text
dy / gcd + "/" + dx / gcd
```

---

## ✅ Solution

```java
class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;

        if (n <= 2) return n;

        int ans = 1;

        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new HashMap<>();

            for (int j = i + 1; j < n; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                int common = gcd(dx, dy);

                String slope = (dy / common) + "/" + (dx / common);

                map.put(slope, map.getOrDefault(slope, 0) + 1);

                ans = Math.max(ans, map.get(slope) + 1);
            }
        }

        return ans;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```

---

## ⏱ Time Complexity

For every point, we compare it with every other point.

**Time Complexity:** `O(n² log C)`

Where `C` represents the coordinate difference and the logarithmic factor comes from the GCD calculation.

In standard interview analysis, this is commonly treated as approximately:

**O(n²)**

---

## 💾 Space Complexity

For each reference point, the HashMap can contain up to `O(n)` different slopes.

**Space Complexity:** `O(n)`

---

## 📚 Concepts Used

- HashMap
- Geometry
- Slope
- GCD
- Normalization
- Nested Loops
- Counting Frequencies

---

## 🧠 Key Learning

The important idea in this problem is that two points determine a slope.

By fixing one point and grouping all other points by their normalized slope, we can determine how many points lie on the same line.

Using GCD ensures that equivalent slopes are represented by the same HashMap key.