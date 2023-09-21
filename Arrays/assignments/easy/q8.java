package arrays.assignments.easy;
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;

public class q8 {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

    // static int[] smallerNumbersThanCurrent(int[] nums) {
    //     int[] ans = new int[nums.length];

    //     int count;
    //     for (int i = 0; i < nums.length; i++) {
    //         count = 0;
    //         for (int j = 0; j < nums.length; j++) {
    //             if (i != j && nums[j] < nums[i])
    //                 count++;
    //         }
    //         ans[i] = count;
    //     }
    //     return ans;
    // }

    // static int[] smallerNumbersThanCurrent(int[] nums) {
    //     int[] bucket = new int[101];
    //     int[] count = new int[101];

    //     for (int i = 0; i < nums.length; i++) {
    //         bucket[nums[i]]++;
    //     }

    //     for (int i = 1; i < count.length; i++) {
    //         count[i] = count[i - 1] + bucket[i - 1];
    //     }

    //     // modifying the original array to save space to reach O(1). Don't do this in production code!
    //     for (int i = 0; i < nums.length; i++) {
    //         nums[i] = count[nums[i]];
    //     }

    //     return nums;
    // }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[102];
        for (int i = 0; i < nums.length; bucket[nums[i] + 1]++, i++);
        for (int i = 0; i < 101; bucket[i + 1] += bucket[i], i++);
        for (int i = 0; i < nums.length; nums[i] = bucket[nums[i]], i++);
        return nums;
    }
}
