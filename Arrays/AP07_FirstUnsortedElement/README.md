# AP7 - First Unsorted Element

## Problem Statement

Write a Java program to find the first element that breaks the ascending order of an array.

---

## Approach

1. Traverse through the array and compare each element with the next element.
2. If the current element is greater than or equal to the next element, return the next element.
3. If no such element is found, return `-1`.

---

## Input

```java
int[] arr = { 2, 5, 8, 13, 9, 17 };
```

---

## Output

```text
First Unsorted element : 9
```

---

## Time Complexity

**O(n)** — The array is traversed once in the worst case.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used.
