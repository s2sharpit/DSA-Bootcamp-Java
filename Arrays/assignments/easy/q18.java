package arrays.assignments.easy;
// https://leetcode.com/problems/add-to-array-form-of-integer/

import java.util.*;

public class q18 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 0, 0 };
        int k = 34;
        List<Integer> result = addToArrayForm(num, k);
        System.out.println(result);
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
            // List<Integer> res = new ArrayList<>();
            List<Integer> res = new LinkedList<>(); //linkedlist is faster but memory used is more

            for (int i = num.length - 1; i>= 0; i--) {
                res.add(0, (num[i] + k) % 10);
                k = (num[i] + k) / 10;
            }
            while (k > 0) {
                res.add(0, k % 10);
                k /= 10;
            }
            
            return res;
    }
}
