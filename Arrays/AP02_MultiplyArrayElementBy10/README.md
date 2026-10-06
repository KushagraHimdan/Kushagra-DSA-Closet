# AP2 – Multiply Array Elements by 10

## Problem

Given an integer array, create a new array in which every element of the original array is multiplied by 10.

## Approach

1. Create a new array with the same size as the input array.
2. Traverse through each element of the original array.
3. Multiply each element by `10`.
4. Store the resulting value at the corresponding index of the new array.
5. Return the new array.

## Example

### Input

```text
[2, 4, 1, 3, 9]
```

### Output

```text
[20, 40, 10, 30, 90]
```

## Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(n)
