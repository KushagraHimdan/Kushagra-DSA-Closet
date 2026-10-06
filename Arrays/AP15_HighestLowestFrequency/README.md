# AP15 - Highest and Lowest Frequency

## Problem Statement

Write a Java program to find the elements with the highest and lowest frequency in an array.

---

## Approach

1. Create a `HashMap` to store each element and its frequency.
2. Traverse through the array and update the frequency of each element.
3. Initialize variables to track the highest and lowest frequencies and their corresponding elements.
4. Traverse through the keys of the `HashMap`.
5. If the current frequency is greater than `maxFreq`, update `maxFreq` and `maxFreqKey`.
6. If the current frequency is less than `minFreq`, update `minFreq` and `minFreqKey`.
7. Store both elements in an array and return the result.

---

## Input

```java
int[] arr = { 1, 1, 3, 3, 3, 4, 5, 6, 6, 7, 7, 7, 7 };
```

---

## Output

```text
Highest freq is : 7 Lowest freq is : 4
```

---

## Time Complexity

**O(n)** — The array is traversed once to calculate frequencies, followed by a traversal of the `HashMap`.

---

## Space Complexity

**O(n)** — The `HashMap` stores the frequency of the elements.
