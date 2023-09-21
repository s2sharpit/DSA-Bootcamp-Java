package arrays.assignments.medium;
// https://leetcode.com/problems/spiral-matrix-ii/

import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int[][] res = generateMatrix(3);
        System.out.println(Arrays.deepToString(res));
    }

    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int rowBegin = 0, rowEnd = n - 1;
        int colBegin = 0, colEnd = n - 1;
        int num = 1;

        // while (rowBegin <= rowEnd && colBegin<=colEnd){
        while (num <= n * n) {
            for (int i = colBegin; i <= colEnd; i++)
                matrix[rowBegin][i] = num++;
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++)
                matrix[i][colEnd] = num++;
            colEnd--;

            for (int i = colEnd; i >= colBegin; i--)
                matrix[rowEnd][i] = num++;
            rowEnd--;

            for (int i = rowEnd; i >= rowBegin; i--)
                matrix[i][colBegin] = num++;
            colBegin++;
        }

        return matrix;
    }
}
