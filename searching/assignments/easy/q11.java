package searching.assignments.easy;
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

public class q11 {
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };

        System.out.println(countNegatives(matrix));
    }

    static int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            count += binarySearch(row);
        }
        return count;
    }

    static int binarySearch(int[] row) {
        int start = 0, end = row.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (row[mid] < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // start is the first positive element
        // end is the last negative element
        // start - end - 1 is the number of negative elements
        return row.length - start;
    }
}
