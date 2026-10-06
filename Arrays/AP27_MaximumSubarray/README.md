# AP27 - Maximum Subarray

## Problem Statement

Write a Java program to find the maximum sum of a contiguous subarray.

---

## Approach

1. Initialize `sum` with `0` and `maximum` with `Integer.MIN_VALUE`.
2. Traverse through each element of the array.
3. Add the current element to `sum`.
4. Update `maximum` with the larger value between `maximum` and `sum`.
5. If `sum` becomes negative, reset it to `0`.
6. Continue the process until the entire array is traversed.
7. Return `maximum` as the maximum subarray sum.

---

## Input

```java id="3v2f5k"
int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
```

---

## Output

```text id="c0g3y7"
maximum sum : 6
```

---

## Time Complexity

**O(n)** — The array is traversed once.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used.
