package searching.binarySearch.questions;
// https://leetcode.com/problems/find-in-mountain-array/description/

public class searchInMountain {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0 };
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1)
            return firstTry;
        // try to search in second half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // you are in the decreasing part of the array
                // this may be the ans, but look at the left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in the ascending part of the array
                start = mid + 1; // because we know that mid + 1 element is greater than mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the two checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence when they are pointing to just one element, that is the max one because that is what the check say
        // more elaboration: at every point of time and end, the have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence because of the above line that is the best possible ans
        return start; // or return end as both are equal
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
