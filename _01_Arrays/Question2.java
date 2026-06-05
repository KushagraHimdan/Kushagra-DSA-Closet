/*
Problem: Rotate Array by K Positions

Description:
Rotate an array to the right by k positions using the Reversal Algorithm.
The rotation is performed in-place without using any extra array.

Approach:

1. Calculate k = k % n to handle cases where k is greater than the array size.
2. Reverse the last k elements.
3. Reverse the first n - k elements.
4. Reverse the entire array.
5. The array is now rotated to the right by k positions.

Example:
Input:
Array = [1, 2, 3, 4, 5, 6, 7]
k = 2

Step 1:
[1, 2, 3, 4, 5, 7, 6]

Step 2:
[5, 4, 3, 2, 1, 7, 6]

Step 3:
[6, 7, 1, 2, 3, 4, 5]

Output:
[6, 7, 1, 2, 3, 4, 5]

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;

        rotateArray(arr, k);

        System.out.println(Arrays.toString(arr));
    }

    static void rotateArray(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        reverse(arr, n - k, n - 1);

        reverse(arr, 0, n - k - 1);

        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

}