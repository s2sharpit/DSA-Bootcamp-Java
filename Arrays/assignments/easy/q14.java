package arrays.assignments.easy;
// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

public class q14 {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {
                { 0, 1 },
                { 1, 1 }
        };

        System.out.println(oddCells(m, n, indices));
    }

    // static int oddCells(int m, int n, int[][] indices) {
    //     int[][] matrix = new int[m][n];
        
    //     for (int[] index : indices) {
    //         for (int i = 0; i < n; i++)
    //         matrix[index[0]][i]++;
    //         for (int i = 0; i < m; i++)
    //         matrix[i][index[1]]++;
    //     }

    //     int count = 0;

    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             count += matrix[i][j] % 2;
    //         }
    //     }

    //     return count;
    // }

    static int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];

        for (int[] index: indices) {
            row[index[0]]++;
            col[index[1]]++;
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                count += (row[i] + col[j]) % 2;
            }
        }
        return count;
    }
}
