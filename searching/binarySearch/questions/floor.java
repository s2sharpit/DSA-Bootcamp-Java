package searching.binarySearch.questions;
// floor: greatest number which is smaller or equal to target

public class floor {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;

        System.out.println(Floor(arr, target));
    }

    // return the index of greatest no <= target
    static int Floor(int[] arr, int target) {
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
        // end = start - 1 (loop condition violation)
        return arr[end];
    }
}
