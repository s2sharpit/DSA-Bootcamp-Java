package searching.assignments.easy;
// https://leetcode.com/problems/fair-candy-swap/

import java.util.Arrays;
import java.util.stream.IntStream;

public class q14 {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1}, bobSizes = {2,2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }

    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int diff = (IntStream.of(bobSizes).sum() - IntStream.of(aliceSizes).sum()) / 2;

        Arrays.sort(bobSizes);
        for (int a: aliceSizes) {
            if (bs(bobSizes, a + diff))
                return new int[] {a, a + diff};
        }
        return new int[0];
    }

    static boolean bs(int[] arr, int target) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] > target) {
                r = m - 1;
            } else if (arr[m] < target) {
                l = m + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
