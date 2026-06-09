/*
Problem: Matrix Multiplication

Description:
Given two matrices A and B, multiply them and return the resulting matrix.

Condition:
Matrix multiplication is possible only if:
(Number of columns in A) = (Number of rows in B)

Approach:

1. Validate whether matrix multiplication is possible.
2. Create a result matrix of size:
   (rows of A) × (columns of B)
3. For each cell (i, j) in the result matrix:

   * Multiply corresponding elements from
     row i of A and column j of B.
   * Add the products to obtain the final value.

Example:

A = [ [1, 2, 3],
[4, 5, 6] ]

B = [ [7, 8],
[9, 10],
[11, 12] ]

Result:

[ [58, 64],
[139, 154] ]

Time Complexity: O(r1 × c1 × c2)
Space Complexity: O(r1 × c2)

where:
r1 = rows of first matrix
c1 = columns of first matrix
c2 = columns of second matrix
*/

import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int[][] brr = {
                { 7, 8 },
                { 9, 10 },
                { 11, 12 }
        };

        int[][] result = multiplyMatrix(arr, brr);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] multiplyMatrix(int[][] arr, int[][] brr) {

        int arrRow = arr.length;
        int arrCol = arr[0].length;

        int brrRow = brr.length;
        int brrCol = brr[0].length;

        // Matrix multiplication is possible only when:
        // columns of first matrix = rows of second matrix
        if (arrCol != brrRow) {
            throw new IllegalArgumentException(
                    "Matrix multiplication not possible");
        }

        // Result matrix dimensions:
        // rows of first matrix × columns of second matrix
        int[][] res = new int[arrRow][brrCol];

        // Compute each cell of the result matrix
        for (int i = 0; i < arrRow; i++) {

            for (int j = 0; j < brrCol; j++) {

                // Dot product of row i and column j
                for (int k = 0; k < arrCol; k++) {
                    res[i][j] += arr[i][k] * brr[k][j];
                }
            }
        }

        return res;
    }

}
