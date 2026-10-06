# AP17 - Sort Zeroes and Ones

## Problem Statement

Write a Java program to sort an array containing only zeroes and ones, placing all zeroes before the ones.

---

## Approach

1. Initialize two pointers: `start` at the beginning and `end` at the end of the array.
2. If `arr[start]` is `1` and `arr[end]` is `0`, swap the two elements.
3. If `arr[start]` is `0`, increment `start`.
4. If `arr[end]` is `1`, decrement `end`.
5. Continue the process until the two pointers meet.

---

## Input

```java
int[] arr = { 1, 0, 1, 0, 1, 0, 0, 1, 1, 0 };
```

---

## Output

```text
0 0 0 0 0 1 1 1 1 1
```

---

## Time Complexity

**O(n)** — The two pointers traverse the array in a single pass.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used.
