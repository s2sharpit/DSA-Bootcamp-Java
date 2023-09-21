package arrays.assignments.easy;
// https://leetcode.com/problems/reshape-the-matrix/

import java.util.Arrays;

public class q25 {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 1, c = 4;
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat;
        
        int[][] res = new int[r][c];
        
        for (int i = 0; i < m * n; i++) {
            res[i / c][i % c] = mat[i / n][i % n];
        }

        return res;
    }
}
