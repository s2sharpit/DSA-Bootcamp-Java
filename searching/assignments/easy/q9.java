package searching.assignments.easy;
// https://leetcode.com/problems/search-insert-position/

public class q9 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;

        System.out.println(searchInsert(nums, target));
    }

    static int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (target < nums[m]) {
                r = m - 1;
            } else if (target > nums[m]) {
                l = m + 1;
            } else {
                return m;
            }
        }
        return l;
    }    
}
