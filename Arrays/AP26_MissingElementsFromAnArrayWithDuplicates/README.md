# AP26 - Missing Elements from an Array with Duplicates

## Problem Statement

Write a Java program to find the missing elements from an array of size `n`, where the elements should be from `1` to `n` and some elements may occur multiple times.

---

## Approach

1. Create an `ArrayList` to store the missing elements.
2. Traverse through the array and take the absolute value of each element.
3. Use the value to calculate its corresponding index using `value - 1`.
4. Mark the element as visited by making the value at that index negative.
5. Traverse through the array again.
6. If an element is still positive, its corresponding number is missing, so add `i + 1` to the result list.
7. Return the list containing all missing elements.

---

## Input

```java id="4e9jtb"
int[] arr = { 1, 4, 4, 5, 2, 2 };
```

---

## Output

```text id="j0gk5a"
[3, 6]
```

---

## Time Complexity

**O(n)** — The array is traversed twice.

---

## Space Complexity

**O(n)** — The `ArrayList` stores the missing elements. The array is modified in-place, requiring no additional array.
