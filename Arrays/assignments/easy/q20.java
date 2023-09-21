package arrays.assignments.easy;
// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

import java.util.Arrays;

public class q20 {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(findRotation(mat, target));
    }

    // static boolean findRotation(int[][] mat, int[][] target) {
    //     for (int rotate = 0; rotate < 4; rotate++) {
    //         if (compareMatrices(mat, target)) {
    //             return true;
    //         }
    //         target = rotate(target);
    //     }
    //     return false;
    // }

    // static boolean compareMatrices(int[][] mat1, int[][] mat2) {
    //     for (int i = 0; i < mat1.length; i++) {
    //         for (int j = 0; j < mat1[0].length; j++) {
    //             if (mat1[i][j] != mat2[i][j]) {
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    // static int[][] rotate(int[][] mat) {
    //     int[][] res = new int[mat[0].length][mat.length];
    //     for (int i = 0; i < mat.length; i++) {
    //         for (int j = 0; j < mat[0].length; j++) {
    //             res[i][j] = mat[mat.length - 1 - j][i];
    //         }
    //     }
    //     return res;
    // }

    static boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        boolean []res = new boolean[4];
        Arrays.fill(res, true);
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] !=target[i][j]) res[0] = false; // 0
                if(mat[i][j] != target[n-j-1][i]) res[1] = false; // 90
                if(mat[i][j] != target[n-i-1][n-j-1]) res[2] = false; // 180
                if(mat[i][j] != target[j][n-i-1]) res[3] = false; // 270
            }
        }
        return res[0] || res[1] || res[2] || res[3];
    }
}
