/*
Problem: Rotate Matrix by 90 Degrees Anti-Clockwise

Description:
Given an N × N matrix, rotate it by 90 degrees anti-clockwise
without using any extra matrix.

Approach:

1. Process the matrix layer by layer.
2. Each layer forms a cycle.
3. For every element in the current layer:
   * Move right element to top.
   * Move bottom element to right.
   * Move left element to bottom.
   * Move top element to left.
4. Continue until all layers are processed.

Example:

Input:
1   2   3   4
5   6   7   8
9   10  11  12
13  14  15  16

Output:
4   8   12  16
3   7   11  15
2   6   10  14
1   5   9   13

Time Complexity: O(n²)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        rotateMatrix(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void rotateMatrix(int[][] matrix) {

        int n = matrix.length;

        // Process one layer at a time
        for (int i = 0; i < n / 2; i++) {

            // Rotate all elements in the current layer
            for (int j = i; j < n - i - 1; j++) {

                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][n - i - 1];

                matrix[j][n - i - 1] = matrix[n - i - 1][n - j - 1];

                matrix[n - i - 1][n - j - 1] = matrix[n - j - 1][i];

                matrix[n - j - 1][i] = temp;
            }
        }
    }
}
