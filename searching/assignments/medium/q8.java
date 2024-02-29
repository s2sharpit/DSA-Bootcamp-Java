package searching.assignments.medium;
// https://leetcode.com/problems/reach-a-number/
public class q8 {
    public static void main(String[] args) {
        System.out.println(reachNumber(3));
    }
    static int reachNumber(int target) {
        target = Math.abs(target);
        int l = 0, r = target, numMoves = 0;
        long finalPosition = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            long sum = (long) m * (m + 1) / 2;
            if (sum >= target) {
                finalPosition = sum;
                numMoves = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ((int) (finalPosition - target)) % 2 == 0 ? numMoves : numMoves % 2 == 0 ? numMoves + 1 : numMoves + 2;
    }
}
