package practice;
// https://leetcode.com/problems/sort-array-by-parity/?envType=daily-question&envId=2023-09-28

import java.util.Arrays;

public class c {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] result = sortArrayByParity(nums);
        // System.out.println(Arrays.toString(result));
    }

    static int[] sortArrayByParity(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            if (nums[low] % 2 == 0) {
                low++;
            } else if (nums[high] % 2 != 0) {
                high--;
            } else {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                System.out.println(Arrays.toString(nums));
            }
            System.out.println(low + ", " + high);
        }
        return nums;
    }
}
