package searching.assignments.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q13 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length, n2 = nums2.length;
        int i = 0, j = 0;
        List<Integer> v = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (nums1[i] == nums2[j]) {
                v.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        int[] ans = new int[v.size()];
        int k = 0;
        for (int val : v)
            ans[k++] = val;
        return ans;
    }




    // BINARY SEARCH

    // public int[] intersect(int[] nums1, int[] nums2) {
    //     if(nums2.length < nums1.length)
	// 	    return intersect(nums2, nums1);

    //     Arrays.sort(nums1);
    //     Arrays.sort(nums2);

    //     List<Integer> result = new ArrayList<>();
    //     int leftIndex = 0;
    //     for(int num: nums1){
    //         int index = binarySearch(nums2, num, leftIndex);
    //         if(index != -1){
    //             result.add(num);
    //             leftIndex = index + 1;
    //         }
    //     }
    //     return result.stream().mapToInt(Integer::intValue).toArray();
    // }

    // int binarySearch(int[] nums, int target, int l) {
    //     int h = nums.length - 1, i = -1;
    //     while (l <= h) {
    //         int m = l + (h - l) / 2;
    //         if (nums[m] == target) {
    //             i = m;
    //             h = m - 1;
    //         } else if (nums[m] > target) {
    //             h = m - 1;
    //         } else {
    //             l = m + 1;
    //         }
    //     }
    //     return i;
    // }
}
