package searching.assignments.easy;
// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

import java.util.Arrays;

public class q16 {
    public static void main(String[] args) {
        int[] nums = {0,4,3,0,4};
        System.out.println(specialArray(nums));
    }

    static  int specialArray(int[] nums) {
       Arrays.sort(nums);
        for(int i = 0 ; i <= nums[nums.length - 1] ; i++){
            if(i == nums.length-leftMostIndex(nums,i)) return i ;
        }
        return -1;
    }

    static int leftMostIndex(int[] nums ,int target){
       int left = 0 , right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>=target){
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }
        }
        return left;
    }
}
