# AP10 - Alternate Extreme Element

## Problem Statement

Write a Java program to print the elements of an array alternately from the beginning and the end.

---

## Approach

1. Initialize two pointers: `l` at the beginning and `r` at the end of the array.
2. While `l <= r`, print the element at the left pointer.
3. Increment `l` and print the element at the right pointer.
4. Decrement `r` and continue the process.
5. If both pointers meet at the same element, print it and stop.

---

## Input

```java
int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
```

---

## Output

```text
1 7 2 6 3 5 4
```

---

## Time Complexity

**O(n)** — Each element of the array is visited once.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used.
