/*
Problem: Find All Duplicate Elements in an Array

Description:
Given an array containing integers in the range 1 to n,
find all elements that appear exactly twice.

Approach:

1. Use the value of each element as an index.
2. For an element x, visit index (x - 1).
3. If the value at that index is already negative,
   then x has been seen before and is a duplicate.
4. Otherwise, mark the index as visited by making
   its value negative.

Example:

Input:
[2, 3, 1, 2, 3]

Process:
2 → mark index 1
3 → mark index 2
1 → mark index 0
2 → index 1 already negative → duplicate
3 → index 2 already negative → duplicate

Output:
[2, 3]

Time Complexity: O(n)
Space Complexity: O(1)
(Note: Output array is not counted as extra space)
*/

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 1, 2, 3 };

        ArrayList<Integer> res = duplicates(arr);

        for (int ele : res) {
            System.out.print(ele + " ");
        }

        System.out.println();
    }

    public static ArrayList<Integer> duplicates(int[] arr) {

        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int idx = Math.abs(arr[i]) - 1;

            // If already visited, element is a duplicate
            if (arr[idx] < 0) {
                ans.add(Math.abs(arr[i]));
            } else {

                // Mark as visited
                arr[idx] = -arr[idx];
            }
        }

        return ans;
    }
}
