package searching.assignments.easy;
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class q4 {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
    
    // // two pointer
    // public int[] twoSum(int[] nums, int target) {
    //     int l = 0, r = nums.length - 1;

    //     while (l < r) {
    //         int sum = nums[l] + nums [r];
    //         if (sum == target) return new int[] {l++, r++};
    //         else if (sum < target) l++;
    //         else r--;
    //     }

    //     return new int[] { -1, -1 };
    // }


    // binary search
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1, end = nums.length - 1;
            
            while (start < end) {
                int mid = start + (end - start) / 2;
                int sum = nums[i] + nums[mid];
                if (sum == target) {
                    return new int[] {i + 1, mid + 1};
                } else if (sum > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return new int[] {-1, -1};
    }
}
