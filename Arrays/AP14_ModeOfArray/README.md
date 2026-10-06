# AP14 - Mode of Array

## Problem Statement

Write a Java program to find the mode of an array. The mode is the element that occurs most frequently in the array.

---

## Approach

1. Create a `HashMap` to store each element and its frequency.
2. Traverse through the array and update the frequency of each element.
3. Initialize `maxFreq` and `maxFreqKey` to keep track of the highest frequency and its corresponding element.
4. Traverse through the keys of the `HashMap`.
5. If the current element's frequency is greater than `maxFreq`, update `maxFreq` and `maxFreqKey`.
6. Return the element with the highest frequency.

---

## Input

```java
int[] arr = { 1, 1, 3, 3, 3, 4, 5, 6, 6, 7, 7, 7, 7 };
```

---

## Output

```text
Mode is : 7
```

---

## Time Complexity

**O(n)** — The array is traversed once to calculate frequencies, followed by a traversal of the `HashMap`.

---

## Space Complexity

**O(n)** — The `HashMap` stores the frequency of the elements.
