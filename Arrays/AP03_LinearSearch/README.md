# AP3 – Linear Search

## Problem

Given an integer array and a target element, find the index of the target element using **Linear Search**. If the target is not present in the array, return `-1`.

## Approach

1. Start traversing the array from the first element.
2. Compare each element with the target.
3. If the current element matches the target, return its index.
4. If the entire array is traversed without finding the target, return `-1`.

## Example

### Input

```text
Array: [2, 4, 1, 3, 9]
Target: 3
```

### Output

```text
The target is at index 3.
```

## Complexity

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)
