package arrays.assignments.medium;
// https://leetcode.com/problems/rotate-array/

import java.util.Arrays;

public class q8 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(nums, k);
    }

    // APPROACH 3
    static void rotate(int[] nums, int k) {
        int[] oldNums = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = oldNums[i];
        }
        System.out.println(Arrays.toString(nums));
    }

    // APPROACH 2
    // static void rotate(int[] nums, int k) {
    //     reverse(nums, 0, nums.length-1);
    //     reverse(nums, 0, k-1);
    //     reverse(nums, k, nums.length-1);

    //     System.out.println(Arrays.toString(nums));
    // }
    
    // APPROACH 1
    // static void rotate(int[] nums, int k) {
    //     while(k-- > 0) {
    //         int temp = nums[nums.length - 1];
    //         for (int i = nums.length - 1; i > 0; i--) {
    //             nums[i] = nums[i - 1];
    //         }
    //         nums[0] = temp;
    //     }
    //     System.out.println(Arrays.toString(nums));
    // }



    
    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
