package arrays.assignments.easy;
// https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.Arrays;

public class q9 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };

        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (index[i] < i) {
                for (int j = i; j > index[i]; j--) {
                    target[j] = target[j - 1];
                }
            }
            target[index[i]] = nums[i];
        }

        return target;
    }
}
