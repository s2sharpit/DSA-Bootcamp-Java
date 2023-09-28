package searching.binarySearch.questions;
// https://leetcode.com/problems/split-array-largest-sum/

public class splitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(SplitArray(nums, k));
    }

    static int SplitArray(int[] nums, int k) {
        int start = 0, end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item from the array
            end += nums[i];
        }

        // binary search
        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, so new sum = num
                    sum = num;
                    pieces++;
                } else {
                    // you can add this num in current subarray
                    sum += num;
                }
            }

            if (pieces > k) {
                // you need to increase the max sum as you need to decrease the no. of pieces
                start = mid + 1;
            } else {
                // you need to decrease the max sum as you need to increase the no. of pieces
                end = mid;
            }
        }

        return end; // here start == end
    }
}
