package arrays.assignments.medium;
// https://leetcode.com/problems/set-matrix-zeroes/

import java.util.Arrays;

public class q4 {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        setZeroes(matrix);
    }

    static void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        boolean isCol0 = false;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) isCol0 = true;

            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;

            if (isCol0) matrix[i][0] = 0;
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
