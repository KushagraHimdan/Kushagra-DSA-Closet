# AP4 - Maximum Element in an Array

## Problem Statement

Write a Java program to find the maximum element in an array.

---

## Approach

1. Initialize a variable `max` with `Integer.MIN_VALUE`.
2. Traverse through each element of the array.
3. Compare each element with `max`.
4. If an element is greater than `max`, update the value of `max`.
5. Return the maximum element.

---

## Input

```java
int[] arr = { 13, 2, 8, 9, 4, 4, 7 };
```

---

## Output

```text
Maximum element in an array is : 13
```

---

## Time Complexity

**O(n)** — The array is traversed once.

---

## Space Complexity

**O(1)** — Only one extra variable is used.
