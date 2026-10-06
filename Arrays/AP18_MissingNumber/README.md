# AP18 - Missing Number

## Problem Statement

Write a Java program to find the missing number in an array containing distinct numbers from the range `0` to `n`.

---

## Approach

1. Initialize a variable `xorSum` with `0`.
2. Traverse through the array and XOR each element with `xorSum`.
3. Traverse through the range from `0` to `arr.length` and XOR each number with `xorSum`.
4. Since XOR of a number with itself is `0`, the numbers present in both the array and the range cancel each other out.
5. Return the remaining value as the missing number.

---

## Input

```java
int[] arr = { 2, 4, 0, 1, 3 };
```

---

## Output

```text
Missing Number : 5
```

---

## Time Complexity

**O(n)** — The array and the range are traversed once each.

---

## Space Complexity

**O(1)** — Only a fixed number of extra variables are used.
