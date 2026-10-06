# AP9 - Array Intersection Element

## Problem Statement

Write a Java program to find the common elements present in two arrays.

---

## Approach

1. Create a `HashMap` to store the elements and their occurrence count.

2. Traverse through the first array and store each element in the `HashMap`.

3. Traverse through the second array and update the occurrence count of each element.

4. Traverse through the keys of the `HashMap`.

5. If the occurrence count of an element is greater than `1`, print it as an intersection element.

---

## Input

```java
int[] arr = { 1, 1, 2, 3, 4, 5, 5, 6 };
int[] brr = { 3, 5, 9, 12 };
```

---

## Output

```text
Intersection : 
3 5
```

---

## Time Complexity

**O(n + m)** — Both arrays are traversed once, where `n` and `m` are the sizes of the two arrays.

---

## Space Complexity

**O(n)** — The `HashMap` stores the elements of the first array.
