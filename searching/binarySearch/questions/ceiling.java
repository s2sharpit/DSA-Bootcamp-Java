package searching.binarySearch.questions;
// ceiling: smallest number which is greater or equal to target

public class ceiling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;

        System.out.println(Ceiling(arr, target));
    }

    // return the index of smallest no >= target
    static int Ceiling(int[] arr, int target) {

        // but if the target is greatest than the greatest number in the array
        if (target > arr[arr.length - 1])
            return -1;

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        // start = end + 1
        return start;
    }
}
