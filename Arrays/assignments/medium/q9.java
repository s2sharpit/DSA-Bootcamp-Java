package arrays.assignments.medium;
// https://leetcode.com/problems/sort-colors/

import java.util.Arrays;

public class q9 {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    // one pass in place solution
    static void sortColors(int[] nums) {
        int j = 0, k = nums.length - 1;
        for (int i = 0; i <= k; i++) {
            if (nums[i] == 0)
                swap(nums, i, j++);
            else if (nums[i] == 2)
                swap(nums, i--, k--);
        }
        System.out.println(Arrays.toString(nums));
    }


    // one pass in place solution
    // static void sortColors(int A[], int n) {
    //     int j = 0, k = n - 1;
    //     for (int i = 0; i <= k; ++i) {
    //         if (A[i] == 0 && i != j)
    //             swap(A, i, j++);
    //         else if (A[i] == 2 && i != k)
    //             swap(A, i--, k--);
    //     }
    // }


    // one pass in place solution
    // void sortColors(int A[], int n) {
    //     int n0 = -1, n1 = -1, n2 = -1;
    //     for (int i = 0; i < n; ++i) {
    //         if (A[i] == 0) {
    //             A[++n2] = 2;
    //             A[++n1] = 1;
    //             A[++n0] = 0;
    //         } else if (A[i] == 1) {
    //             A[++n2] = 2;
    //             A[++n1] = 1;
    //         } else if (A[i] == 2) {
    //             A[++n2] = 2;
    //         }
    //     }
    // }


    // two pass O(m+n) space
    // void sortColors(int A[], int n) {
    //     int num0 = 0, num1 = 0, num2 = 0;

    //     for (int i = 0; i < n; i++) {
    //         if (A[i] == 0)
    //             ++num0;
    //         else if (A[i] == 1)
    //             ++num1;
    //         else if (A[i] == 2)
    //             ++num2;
    //     }

    //     for (int i = 0; i < num0; ++i)
    //         A[i] = 0;
    //     for (int i = 0; i < num1; ++i)
    //         A[num0 + i] = 1;
    //     for (int i = 0; i < num2; ++i)
    //         A[num0 + num1 + i] = 2;
    // }
}
