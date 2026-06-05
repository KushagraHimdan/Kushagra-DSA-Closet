/*
Problem: Reverse an Array

Description:
Reverse the elements of an array in-place without using any extra array.

Approach:

* Use two pointers:

* One pointer starts from the beginning (left).
* Another pointer starts from the end (right).
* Swap the elements at both pointers.
* Move left forward and right backward.
* Continue until both pointers meet.

Example:
Input:  [1, 2, 3, 4, 5, 6, 7]
Output: [7, 6, 5, 4, 3, 2, 1]

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        reverseArray(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

}
