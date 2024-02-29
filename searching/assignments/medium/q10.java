package searching.assignments.medium;
import java.util.Arrays;
// https://leetcode.com/problems/koko-eating-bananas/
public class q10 {
    public static void main(String[] args) {
        // int[] piles = { 30, 11, 23, 4, 20 };
        // int h = 6;
        // int[] piles = { 312884470 };
        // int h = 312884469;
        int[] piles = { 805306368, 805306368, 805306368 };
        int h = 1000000000;
        System.out.println(minEatingSpeed(piles, h));
    }
    static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l = 1, r = piles[piles.length - 1];

        while (l <= r) {
            int m = l + (r - l) / 2;
            long sum = getSum(piles, m);
            if (sum > h) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    static long getSum(int[] piles, int m) {
        long sum = 0;
        for (int pile : piles) {
            sum += pile / m + (pile % m == 0 ? 0 : 1);
            System.out.println(sum);
        }
        return sum;
    }
}