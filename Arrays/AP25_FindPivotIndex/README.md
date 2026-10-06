# AP25 - Find Pivot Index

## Problem Statement

Write a Java program to find the pivot index of an array where the sum of elements on the left side is equal to the sum of elements on the right side.

---

## Approach

1. Create two arrays: `leftSum` and `rightSum` to store the cumulative sums from the left and right sides.

2. Store the cumulative sum from the beginning of the array in `leftSum`.

3. Store the cumulative sum from the end of the array in `rightSum`.

4. Traverse through both sum arrays and compare the values at each index.

5. If `leftSum[i]` is equal to `rightSum[i]`, return that index as the pivot index.

6. If no pivot index is found, return `-1`.

---

## Input

```java id="g3q3v5"
int[] arr = { 1, 7, 3, 6, 5, 6 };
```

---

## Output

```text id="u5s5x7"
index : 3
```

---

## Time Complexity

**O(n)** — The array is traversed multiple times, but each traversal takes linear time.

---

## Space Complexity

**O(n)** — Two additional arrays of size `n` are used to store the left and right cumulative sums.
