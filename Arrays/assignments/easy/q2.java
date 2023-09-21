package arrays.assignments.easy;
// https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };

        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));

    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;   
    }
}
