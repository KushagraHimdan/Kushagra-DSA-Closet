/*
Problem: Reverse Array in Groups of Size K

Description:
Given an array and an integer k, reverse the elements
of the array in groups of size k.

If the remaining number of elements is less than k,
reverse them as well.

Approach:

Traverse the array in steps of k.
For each group:
Find the starting index.
Find the ending index.
Reverse the elements within that range using
the two-pointer technique.
Repeat until all groups are processed.

Example:

Input:
Array = [1, 2, 3, 4, 5, 6, 7, 8]
k = 3

Groups:
[1, 2, 3] → [3, 2, 1]
[4, 5, 6] → [6, 5, 4]
[7, 8] → [8, 7]

Output:
[3, 2, 1, 6, 5, 4, 8, 7]

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Main {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 3;

        reverseArrGroups(arr, k);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArrGroups(int[] arr, int k) {

        int n = arr.length;

        // No reversal needed
        if (k <= 1 || n <= 1) {
            return;
        }

        for (int i = 0; i < n; i += k) {

            int left = i;

            // Handles the last group and cases where k > n
            int right = Math.min(i + k - 1, n - 1);

            // Reverse the current group
            while (left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
}
