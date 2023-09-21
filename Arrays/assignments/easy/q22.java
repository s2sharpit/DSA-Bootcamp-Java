package arrays.assignments.easy;
// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

import java.util.Arrays;

public class q22 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    // static int[] sumZero(int n) {
    //     int[] arr = new int[n];
    //     for (int i = 1; i <= n / 2; i++) {
    //         arr[i - 1] = i;
    //         arr[n - i] = -i;
    //     }
    //     return arr;
    // }

    static int[] sumZero(int n) {
        int[] A = new int[n];
        for (int i = 0; i < n; ++i)
            A[i] = i * 2 - n + 1;
        return A;
    }
}
