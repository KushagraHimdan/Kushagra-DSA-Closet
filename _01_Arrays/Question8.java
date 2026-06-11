/*
Problem: Transpose of a Matrix

Description:
Given a matrix, find its transpose.

The transpose of a matrix is obtained by converting
all rows into columns and all columns into rows.

Approach:

1. Determine the number of rows and columns.
2. Create a new matrix with dimensions: columns × rows.
3. Traverse the original matrix.
4. For each element matrix[row][col], place it at transpose[col][row].

Example:

Input:
1  2  3
4  5  6

Output:
1  4
2  5
3  6

Time Complexity: O(rows × cols)
Space Complexity: O(rows × cols)
*/

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        ArrayList<ArrayList<Integer>> result = transpose(matrix);

        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
    }

    public static ArrayList<ArrayList<Integer>> transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transposed matrix will have
        // cols rows and rows columns
        ArrayList<ArrayList<Integer>> tMatrix = new ArrayList<>();

        for (int i = 0; i < cols; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < rows; j++) {

                // Swap row and column indices
                row.add(matrix[j][i]);
            }

            tMatrix.add(row);
        }

        return tMatrix;
    }
}
