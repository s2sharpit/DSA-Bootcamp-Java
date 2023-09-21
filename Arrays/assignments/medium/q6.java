package arrays.assignments.medium;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.*;

public class q6 {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }


    // APPROACH 2
    static int[] searchRange(int[] A, int target) {
        int start = firstGreaterEqual(A, target);
        if (start == A.length || A[start] != target) {
            return new int[] { -1, -1 };
        }
        return new int[] { start, firstGreaterEqual(A, target + 1) - 1 };
    }

    // find the first number that is greater than or equal to target.
    // could return A.length if target is greater than A[A.length-1].
    // actually this is the same as lower_bound in C++ STL.
    static int firstGreaterEqual(int[] A, int target) {
        int low = 0, high = A.length;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            // low <= mid < high
            if (A[mid] < target) {
                low = mid + 1;
            } else {
                // should not be mid-1 when A[mid]==target.
                // could be mid even if A[mid]>target because mid<high.
                high = mid;
            }
        }
        return low;
    }


    // APPROACH 1
    // static int[] searchRange(int[] nums, int target) {
    //     int[] res = {-1, -1};
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] == target) {
    //             res[0] = i;
    //             while (i < nums.length) {
    //                 if (nums[i] == target) {
    //                     res[1] = i;
    //                 }
    //                 i++;
    //             }
    //         }
    //     }
    //     return res;
    // }
}
