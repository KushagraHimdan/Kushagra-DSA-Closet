# AP19 - Unique Element

## Problem Statement

Write a Java program to find the unique element in an array where every other element appears exactly twice.

---

## Approach

1. Initialize a variable `result` with `0`.
2. Traverse through each element of the array.
3. Perform the XOR operation between `result` and the current element.
4. Since XOR of a number with itself is `0`, all duplicate elements cancel each other out.
5. Return the remaining value as the unique element.

---

## Input

```java
int[] arr = { 2, 3, 5, 4, 5, 3, 4 };
```

---

## Output

```text
2
```

---

## Time Complexity

**O(n)** — The array is traversed once.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used.
