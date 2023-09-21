package arrays.assignments.easy;
// https://leetcode.com/problems/transpose-matrix/

import java.util.Arrays;

public class q17 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result));
    }

    static int[][] transpose(int[][] matrix) {
            int[][] res = new int[matrix[0].length][matrix.length];

            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    res[i][j] = matrix[j][i];
                }
            }

            return res;
    }

}
