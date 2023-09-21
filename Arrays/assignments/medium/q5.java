package arrays.assignments.medium;
// https://leetcode.com/problems/product-of-array-except-self/

import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 4 };
        int[] nums = { -1, 1, 0, -3, 3 };
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));

    }

    // better method
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }

    // static int[] productExceptSelf(int[] nums) {
    //     int product = 1, iOfZero = 0;
    //     boolean isZero = false;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] == 0) {
    //             if (isZero) {
    //                 Arrays.fill(nums, 0);
    //                 return nums;
    //             }
    //             isZero = true;
    //             iOfZero = i;
    //             continue;
    //         }
    //         product *= nums[i];
    //     }

    //     if (isZero) {
    //         Arrays.fill(nums, 0);
    //         nums[iOfZero] = product;
    //         return nums;
    //     }

    //     for (int i = 0; i < nums.length; i++) {
    //         nums[i] = product / nums[i];
    //     }

    //     return nums;
    // }
}
