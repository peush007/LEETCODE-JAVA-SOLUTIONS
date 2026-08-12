# 877. Stone Game

## 🔗 Problem Link

https://leetcode.com/problems/stone-game/

---

## 📝 Problem

Alice and Bob play a game with an even number of piles of stones.

Alice goes first. On each turn, a player can take either the leftmost or rightmost pile.

Both players play optimally.

Return `true` if Alice can win the game.

---

## 💡 Approach

For this specific problem, Alice can always win.

The important properties are:

- The number of piles is even.
- Alice gets the first turn.
- Both players play optimally.
- Alice can use a strategy based on choosing either all even-indexed piles or all odd-indexed piles.

Therefore, Alice is guaranteed to win regardless of the arrangement of the piles.

So the solution can simply return:

```java
true
```



## ⏱ Time Complexity

**O(1)**

The input array does not need to be processed.

---

## 💾 Space Complexity

**O(1)**

No additional data structures are used.

---

## 📚 Concepts Used

- Game Theory
- Mathematical Observation
- Optimal Strategy

---

## 🧠 Key Learning

Not every problem requires an algorithmic implementation.

Sometimes understanding the mathematical properties of the problem allows us to reduce the entire solution to a constant-time answer.

For this problem, Alice is guaranteed to win, so:

```java
return true;
```

is sufficient.