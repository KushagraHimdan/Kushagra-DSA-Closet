# AP5 - Sum of Positive and Negative Numbers

## Problem Statement

Write a Java program to find the sum of all positive and negative numbers in an array.

---

## Approach

1. Initialize two variables: `positiveSum` and `negativeSum` with `0`.
2. Traverse through each element of the array.
3. If the element is positive, add it to `positiveSum`.
4. Otherwise, add it to `negativeSum`.
5. Store both sums in an array and return the result.

---

## Input

```java
int[] arr = { 1, -3, -4, 7, 9, -8, 2, 6, 7 };
```

---

## Output

```text
Positive sum : 32 Negative sum : -15
```

---

## Time Complexity

**O(n)** — The array is traversed once.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used.
