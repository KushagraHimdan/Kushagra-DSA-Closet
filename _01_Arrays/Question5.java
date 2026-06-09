/*
Problem: Next Permutation

Description:
Given an array representing a permutation of numbers, find the next lexicographically greater permutation.
If no such permutation exists, rearrange the array into its lowest possible order.

Approach:

1. Find the pivot (first element from the right that is
   smaller than its next element).
2. If no pivot exists, reverse the entire array.
3. Find the smallest element greater than the pivot from
   the right side.
4. Swap the pivot and that element.
5. Reverse the suffix after the pivot.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 5, 4, 3 };

        nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] arr) {

        int n = arr.length;
        int i = n - 2;

        // Find pivot

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // No pivot found

        if (i < 0) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Find next greater element

        int j = n - 1;

        while (arr[j] <= arr[i]) {
            j--;
        }

        swap(arr, i, j);

        // Reverse suffix

        reverse(arr, i + 1, n - 1);
    }

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            swap(arr, left, right);

            left++;
            right--;
        }
    }
}
