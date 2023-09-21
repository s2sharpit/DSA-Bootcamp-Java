package arrays.assignments.easy;
// https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int num = 3;

        int[] ans = shuffle(nums, num);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] nums, int n) {
        // int[] ans = new int[n * 2];
        // int i = 0, j = 0;
        // while(i < n * 2) {
        //     ans[i++] = nums[j];
        //     ans[i++] = nums[j + n];
        //     j++;
        // }
        // return ans;

        
        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[n + i];
        }
        return res;
    }
}
