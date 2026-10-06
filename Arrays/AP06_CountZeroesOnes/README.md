# AP6 - Count Zeroes and Ones

## Problem Statement

Write a Java program to count the number of zeroes and ones in an array.

---

## Approach

1. Initialize two variables: `zero_count` and `one_count` with `0`.
2. Traverse through each element of the array.
3. If the element is `0`, increment `zero_count`.
4. Otherwise, increment `one_count`.
5. Store both counts in an array and return the result.

---

## Input

```java
int[] arr = { 0, 1, 1, 0, 1, 0, 1 };
```

---

## Output

```text
Number of zeroes : 3 Number of Ones : 4
```

---

## Time Complexity

**O(n)** — The array is traversed once.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used.
