# AP21 - Two Sum

## Problem Statement

Write a Java program to find two elements in an array whose sum is equal to a given target.

---

## Approach

1. Traverse through the array using two nested loops.
2. Select the current element using the first loop.
3. Compare it with every element after it using the second loop.
4. If the sum of the two elements is equal to the target, store both elements in an array and return the result.
5. If no pair is found, return an empty array.

---

## Input

```java
int[] arr = { -2, 5, -6, 12, 4, 3 };
int target = 10;
```

---

## Output

```text
[12, -2]
```

---

## Time Complexity

**O(n²)** — Two nested loops are used to check every possible pair of elements.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used, excluding the returned result array.
