/*
Problem: Maximum Sum of Contiguous Subarray

Description:
Find the maximum possible sum of a contiguous subarray within a given array.

Approach:
This solution uses Kadane's Algorithm.

1. Maintain a variable maxEnd to store the maximum sum ending at the current index.
2. For each element, either:
   * Extend the current subarray, or
   * Start a new subarray from the current element.
3. Maintain a variable res to store the maximum subarray sum found so far.
4. Update res whenever a larger sum is encountered.

Example:
Input:
[2, 3, -8, 7, -1, 2, 3]

Subarrays considered:
[2, 3] → 5
[7, -1, 2, 3] → 11

Output:
11

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Main {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
        System.out.println(maxOfSubArray(arr));
    }

    public static int maxOfSubArray(int[] arr) {
        int n = arr.length;

        // result and max of sub array

        int res = arr[0], maxEnd = arr[0];

        // Check the array

        for (int i = 1; i < n; i++) {
            maxEnd = Math.max(maxEnd + arr[i], arr[i]);
            res = Math.max(res, maxEnd);
        }

        return res;

    }
}