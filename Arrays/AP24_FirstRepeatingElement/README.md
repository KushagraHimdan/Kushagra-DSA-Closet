# AP24 - First Repeating Element

## Problem Statement

Write a Java program to find the first element in an array that occurs more than once.

---

## Approach

1. Create a `HashMap` to store each element and its frequency.
2. Traverse through the array and count the occurrences of each element.
3. Traverse through the array again from the beginning.
4. If the frequency of the current element is greater than `1`, return that element.
5. If no repeating element is found, return `-1`.

---

## Input

```java
int[] arr = { 10, 5, 3, 4, 5, 6 };
```

---

## Output

```text
5
```

---

## Time Complexity

**O(n)** — The array is traversed twice, which is still linear time.

---

## Space Complexity

**O(n)** — The `HashMap` stores the frequency of the elements.
