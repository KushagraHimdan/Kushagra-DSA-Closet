# AP12 - Shift Array Elements

## Problem Statement

Write a Java program to shift all elements of an array one position to the right.

---

## Approach

1. Store the last element of the array in a temporary variable.
2. Traverse the array from the last index towards the first index.
3. Shift each element one position to the right.
4. Place the stored last element at the first position.

---

## Input

```java
int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
```

---

## Output

```text
7 1 2 3 4 5 6
```

---

## Time Complexity

**O(n)** — The array is traversed once to shift the elements.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used.
