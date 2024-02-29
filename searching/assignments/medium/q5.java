package searching.assignments.medium;
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class q5 {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;
            // if (nums[l] <= nums[m] && nums[m] > nums[r]) {
            if (nums[m] < nums[r]) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return nums[l];
    }
}
