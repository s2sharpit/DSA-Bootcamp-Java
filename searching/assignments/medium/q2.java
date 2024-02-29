package searching.assignments.medium;
// https://leetcode.com/problems/single-element-in-a-sorted-array/

public class q2 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(nums));
    }

    static int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (m % 2 == 1)
                m--;
            if (nums[m] != nums[m + 1]) {
                r = m;
            } else {
                l = m + 2;
            }
        }
        return nums[l];
    }
}
