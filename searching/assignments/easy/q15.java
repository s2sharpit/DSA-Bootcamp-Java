package searching.assignments.easy;
// https://leetcode.com/problems/check-if-n-and-its-double-exist/

import java.util.Arrays;

public class q15 {
    public static void main(String[] args) {
        int[] arr = {7,1,14,11};
        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            int l = 0, r = arr.length - 1;

            while (l <= r) {
                int m = l + (r - l) / 2;
                if (arr[m] == target && m != i)
                    return true;
                if (arr[m] < target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return false;
    }
}
