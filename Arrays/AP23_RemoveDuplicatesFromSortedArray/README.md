# AP23 - Remove Duplicates from Sorted Array

## Problem Statement

Write a Java program to remove duplicate elements from a sorted array and return the number of unique elements.

---

## Approach

1. Initialize two pointers: `i` to track the position of the last unique element and `j` to traverse the array.
2. Compare the elements at `arr[i]` and `arr[j]`.
3. If they are different, increment `i` and copy `arr[j]` to `arr[i]`.
4. If they are the same, only increment `j` to skip the duplicate element.
5. Continue until `j` reaches the end of the array.
6. Return `i + 1`, which represents the number of unique elements.

---

## Input

```java
int[] arr = { 1, 2, 2, 2, 3, 3, 4, 5, 5, 6, 6, 6, 6, 7 };
```

---

## Output

```text
7
```

---

## Time Complexity

**O(n)** — The array is traversed once using the two pointers.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used.
