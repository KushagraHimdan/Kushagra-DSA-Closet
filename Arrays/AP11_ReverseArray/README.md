# AP11 - Reverse Array

## Problem Statement

Write a Java program to reverse the elements of an array.

---

## Approach

1. Initialize two pointers: `l` at the beginning and `r` at the end of the array.
2. Swap the elements at the left and right pointers.
3. Increment `l` and decrement `r`.
4. Continue the process until the two pointers meet.

---

## Input

```java
int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
```

---

## Output

```text
7 6 5 4 3 2 1
```

---

## Time Complexity

**O(n)** — Each element is visited once during the reversal.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used.
