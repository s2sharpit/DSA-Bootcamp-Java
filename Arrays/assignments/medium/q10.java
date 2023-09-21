package arrays.assignments.medium;
// https://leetcode.com/problems/house-robber/

public class q10 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 9, 3, 1 };
        System.out.println(rob(nums));
    }

    static int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        int prev1 = 0, prev2 = 0;
        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }
        return prev1;
    }
}
