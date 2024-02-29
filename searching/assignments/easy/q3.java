package searching.assignments.easy;
// https://leetcode.com/problems/first-bad-version/

public class q3 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(firstBadVersion(n));
    }

    static boolean isBadVersion(int version) {
        return version >= 3;
    }

    static int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (isBadVersion(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1; 
            }
        }
        return start;
    }
}
