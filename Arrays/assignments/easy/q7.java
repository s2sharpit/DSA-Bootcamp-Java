package arrays.assignments.easy;
// https://leetcode.com/problems/number-of-good-pairs/

public class q7 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        System.out.println(numIdenticalPairs(nums));        
    }

    // static int numIdenticalPairs(int[] nums) {
    //     int count = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] == nums[j]) {
    //                 count++;
    //             }
    //         }
    //     }

    //     return count;
    // }

    static int numIdenticalPairs(int[] nums) {
        int res = 0, count[] = new int[101];
        for (int i : nums) {
            res += count[i]++;
        }
        return res;
    }
}
