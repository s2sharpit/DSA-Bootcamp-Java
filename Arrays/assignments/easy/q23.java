package arrays.assignments.easy;
// https://leetcode.com/problems/lucky-numbers-in-a-matrix/

import java.util.*;

public class q23 {
    public static void main(String[] args) {
        int[][] matrix = {
            { 3, 7, 8 },
            { 9, 11, 13 },
            { 15, 16, 17 }
        };
        System.out.println(luckyNumbers(matrix));
    }

    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            int minCol = minColInRow(matrix[row]);
            int value = matrix[row][minCol];
            
            if (checkIfMaxInCol(matrix, minCol, value))
                res.add(value);
        }
        return res;
    }

    static int minColInRow(int[] A ) {
        int minIndex = 0, min = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    static boolean checkIfMaxInCol(int[][] matrix, int col, int value) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][col] > value) return false;
        }
        return true;
    }

    
}
