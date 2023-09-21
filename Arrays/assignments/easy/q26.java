package arrays.assignments.easy;
// https://leetcode.com/problems/plus-one/

import java.util.Arrays;

public class q26 {
    public static void main(String[] args) {
        int[] digits = { 1, 2, 3 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    
    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
