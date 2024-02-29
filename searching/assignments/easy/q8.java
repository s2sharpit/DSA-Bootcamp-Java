package searching.assignments.easy;
// https://leetcode.com/problems/kth-missing-positive-number/

public class q8 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;

        System.out.println(findKthPositive(arr, k));
    }

    static int findKthPositive(int[] arr, int k) {
        int l = 0, r = arr.length;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (k > arr[m] - m - 1) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l + k;
    }
}
