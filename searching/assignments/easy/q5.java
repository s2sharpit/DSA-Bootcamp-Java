package searching.assignments.easy;
// https://leetcode.com/problems/valid-perfect-square/

public class q5 {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    static boolean isPerfectSquare(int num) {
        int start = 1, end = num / 2 + 1;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid < num) {
                start = (int) mid + 1;
            } else if (mid * mid > num) {
                end = (int) mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
