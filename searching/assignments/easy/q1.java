package searching.assignments.easy;
// https://leetcode.com/problems/sqrtx/

public class q1 {
    public static void main(String[] args) {
        int x = 30;
        System.out.println(mySqrt(x));
    }

    static int mySqrt(int x) {
        if (x == 0) return 0;
        int start = 1, end = x / 2 + 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < x / mid) {
                start = mid + 1;
            } else if (mid > x / mid) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
