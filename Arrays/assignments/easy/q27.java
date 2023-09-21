package arrays.assignments.easy;
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class q27 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }
    
    static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1])
                nums[k++] = nums[i];
        }
        return k;
    }
}
