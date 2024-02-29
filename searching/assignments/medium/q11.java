package searching.assignments.medium;
// https://leetcode.com/problems/minimum-absolute-sum-difference/

public class q11 {
    public static void main(String[] args) {
        // int[] nums1 = { 1, 10, 4, 4, 2, 7 };
        // int[] nums2 = { 9, 3, 5, 1, 7, 4 };
        int[] nums1 = { 1, 28, 21 };
        int[] nums2 = { 9, 21, 20 };
        System.out.println(minAbsoluteSumDiff(nums1, nums2));
    }

    static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        // int maxDiff = 0, itate = -1, newItate = -1, total = 0;
        // for (int i = 0; i < nums1.length; i++) {
        //     int diff = Math.abs(nums1[i] - nums2[i]);
        //     if (diff > maxDiff) {
        //         maxDiff = diff;
        //         itate = i;
        //     }
        // }

        // for (int i = 0; i < nums1.length; i++) {
        //     if (itate == -1)
        //         break;
        //     if (itate == i) {
        //         continue;
        //     }
        //     int diff = Math.abs(nums2[itate] - nums1[i]);
        //     if (diff < maxDiff) {
        //         maxDiff = diff;
        //         newItate = i;
        //     }
        // }

        // if (itate != -1 && newItate != -1)
        //     nums1[itate] = nums1[newItate];

        // for (int i = 0; i < nums1.length; i++) {
        //     total += Math.abs(nums1[i] - nums2[i]);
        // }
        // return total;
    }
}