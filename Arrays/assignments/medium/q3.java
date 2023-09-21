package arrays.assignments.medium;
// https://leetcode.com/problems/spiral-matrix-iii/

import java.util.*;

public class q3 {
    public static void main(String[] args) {
        int rows = 1, cols = 4, rStart = 0, cStart = 0;
        // int rows = 5, cols = 6, rStart = 1, cStart = 4;
        int[][] ans = spiralMatrixIII(rows, cols, rStart, cStart);
        System.out.println(Arrays.deepToString(ans));
    }

    static int[][] spiralMatrixIII(int R, int C, int x, int y) {
        int[][] res = new int[R * C][2];
        int dx = 0, dy = 1, n = 0, tmp;
        for (int j = 0; j < R * C; ++n) {
            for (int i = 0; i < n / 2 + 1; ++i) {
                if (0 <= x && x < R && 0 <= y && y < C)
                    res[j++] = new int[] { x, y };
                x += dx;
                y += dy;
            }
            tmp = dx;
            dx = dy;
            dy = -tmp;
        }
        return res;

    }
}
