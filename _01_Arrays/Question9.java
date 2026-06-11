/*
Problem: Spiral Traversal of a Matrix

Description:
Given a matrix, print all elements in spiral order.

The traversal starts from the top-left corner and
moves clockwise layer by layer until all elements
have been visited.

Approach:

1. Maintain four boundaries:

   * top
   * bottom
   * left
   * right
2. Traverse:

   * Top row (left → right)
   * Right column (top → bottom)
   * Bottom row (right → left)
   * Left column (bottom → top)
3. After each traversal, update the corresponding boundary.
4. Continue until all layers are processed.

Example:

Input:
1   2   3   4
5   6   7   8
9   10  11  12
13  14  15  16

Output:
[1, 2, 3, 4, 8, 12, 16, 15,
14, 13, 9, 5, 6, 7, 11, 10]

Time Complexity: O(m × n)
Space Complexity: O(m × n)

where:
m = number of rows
n = number of columns
*/

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        System.out.println(spiralTraversal(matrix));
    }

    public static ArrayList<Integer> spiralTraversal(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        ArrayList<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {

            // Traverse top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }

}
