package arrays.assignments.easy;
// https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };

        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));    
    }

    static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
