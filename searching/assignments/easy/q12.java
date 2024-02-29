package searching.assignments.easy;
// https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class q12 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for (Integer num : nums1) {
            if (binarySearch(nums2, num))
                set.add(num);
        }
        int i = 0;
        int[] result = new int[set.size()];
        for (Integer num : set) {
            result[i++] = num;
        }
        return result;
    }
    
    static boolean binarySearch(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m] == target) {
                return true;
            }
            if (nums[m] > target) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
}
