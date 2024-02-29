package searching.assignments.medium;
// https://leetcode.com/problems/search-a-2d-matrix/
public class q12 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }
}
