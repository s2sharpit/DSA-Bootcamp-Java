package arrays.assignments.easy;
// https://leetcode.com/problems/flipping-an-image/

import java.util.Arrays;

public class q13 {
    public static void main(String[] args) {
        int[][] image = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };

        int[][] flippedImage = flipAndInvertImage(image);
        for (int[] is : flippedImage) {
            System.out.println(Arrays.toString(is));
        }
    }

    // static int[][] flipAndInvertImage(int[][] image) {
    //     int row = image.length;
    //     int col = image[0].length;
    //     int[][] result = new int[row][col];

    //     // Step 1: revert
    //     for (int i = 0; i < row; i++) {
    //         for (int j = 0; j < col; j++) {
    //             result[i][j] = image[i][col - j - 1];
    //         }
    //     }

    //     // Step 2: invert
    //     for (int i = 0; i < row; i++) {
    //         for (int j = 0; j < col; j++) {
    //             result[i][j] = result[i][j] == 1 ? 0 : 1;
    //         }
    //     }

    //     return result;
    // }

    static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row : image)
            for (int i = 0; i * 2 < n; i++)
                if (row[i] == row[n - i - 1])
                    row[i] = row[n - i - 1] ^= 1;   
        return image;
    }
}
