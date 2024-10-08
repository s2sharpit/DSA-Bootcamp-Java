package arrays.assignments.medium;
// https://leetcode.com/problems/spiral-matrix/

import java.util.*;

public class q1 {
    public static void main(String[] args) {
        // int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        System.out.println(spiralOrder(matrix));
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        if (matrix.length == 0) return res;

        int rowBegin = 0, rowEnd = matrix.length - 1;
        int colBegin = 0, colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            for (int i = colBegin; i <= colEnd; i++)
                res.add(matrix[rowBegin][i]);
            rowBegin++;

            // Traverse Down
            for (int i = rowBegin; i <= rowEnd; i++)
                res.add(matrix[i][colEnd]);
            colEnd--;

            // Traverse Left
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--)
                    res.add(matrix[rowEnd][i]);
            }
            rowEnd--;

            // Traverse Up
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--)
                    res.add(matrix[i][colBegin]);
            }
            colBegin++;
        }

        return res;
    }
}
