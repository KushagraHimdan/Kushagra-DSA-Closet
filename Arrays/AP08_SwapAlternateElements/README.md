# AP8 - Swap Alternate Elements

## Problem Statement

Write a Java program to swap alternate elements of an array.

---

## Approach

1. Traverse through the array with a step of `2`.
2. Store the current element in a temporary variable.
3. Swap the current element with the next element.
4. Continue the process until the end of the array.

---

## Input

```java
int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
```

---

## Output

```text
2 1 4 3 6 5 8 7
```

---

## Time Complexity

**O(n)** — The array is traversed once.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used.
