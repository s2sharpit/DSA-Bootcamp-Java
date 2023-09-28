package searching.binarySearch.questions;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class infiniteArray {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;
        
        int ans = findingRange(nums, target);
        System.out.println(ans);
    }

    static int findingRange(int[] nums, int target) {
        // first start with a size of box 2
        int start = 0, end = 1;

        // condition for the target to lie in the range
        while (target > nums[end]) {
            int newStart = end + 1;
            // double the box value
            // end = previousEnd + sizeOfBox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1; 
            } else {
                return mid;
            }
        }
        return -1;
    }
}
