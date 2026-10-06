# AP22 - Three Sum

## Problem Statement

Write a Java program to find three elements in an array whose sum is equal to a given target.

---

## Approach

1. Traverse through the array using three nested loops.
2. Select the first element using the first loop.
3. Select the second element using the second loop, starting from the next position.
4. Select the third element using the third loop, starting from the next position.
5. If the sum of the three elements is equal to the target, store them in an array and return the result.
6. If no such triplet is found, return an empty array.

---

## Input

```java
int[] arr = { 1, 4, -3, 5, 10, -7, 9 };
int target = 8;
```

---

## Output

```text
[1, -3, 10]
```

---

## Time Complexity

**O(n³)** — Three nested loops are used to check every possible combination of three elements.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used, excluding the returned result array.
