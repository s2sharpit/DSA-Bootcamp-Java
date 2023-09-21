package arrays.assignments.easy;
// https://leetcode.com/problems/matrix-diagonal-sum/

public class q15 {
    public static void main(String[] args) {
        int[][] mat = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        System.out.println(diagonalSum(mat));    
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - i - 1];
        }

        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}
