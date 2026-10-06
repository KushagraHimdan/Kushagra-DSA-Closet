# AP16 - Union of Array

## Problem Statement

Write a Java program to find the union of two arrays, containing all distinct elements present in either array.

---

## Approach

1. Create a `HashMap` to store the elements and their occurrence counts.
2. Traverse through the first array and store each element in the `HashMap`.
3. Traverse through the second array and update the occurrence count of each element.
4. Traverse through the keys of the `HashMap`.
5. If the occurrence count of an element is greater than `0`, print it as a union element.

---

## Input

```java
int[] arr = { 1, 1, 2, 3, 4, 5, 5, 6 };
int[] brr = { 3, 5, 9, 12 };
```

---

## Output

```text
Union : 
1 2 3 4 5 6 9 12
```

---

## Time Complexity

**O(n + m)** — Both arrays are traversed once, followed by a traversal of the `HashMap`, where `n` and `m` are the sizes of the two arrays.

---

## Space Complexity

**O(n + m)** — The `HashMap` stores the distinct elements from both arrays.
