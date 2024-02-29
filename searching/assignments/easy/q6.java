package searching.assignments.easy;
// https://leetcode.com/problems/arranging-coins/description/

public class q6 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n));
    }

    static int arrangeCoins(int n) {
        int start = 1, end = n;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long r = mid * (mid + 1) / 2;
            if (n < r) {
                end = (int) mid - 1;
            } else if (n > r) {
                start = (int) mid + 1;
            } else {
                return (int) mid;
            }
        }
        return end;
    }
}
