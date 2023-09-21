package arrays.assignments.easy;
// https://leetcode.com/problems/find-the-highest-altitude/submissions/

public class q12 {
    public static void main(String[] args) {
        // int[] gain = {-5, 1, 5, 0, -7};
        // int[] gain = {-4,-3,-2,-1,4,3,2};
        int[] gain = { 44, 32, -9, 52, 23, -50, 50, 33, -84, 47, -14, 84, 36, -62, 37, 81, -36, -85, -39, 67, -63, 64,
                -47, 95, 91, -40, 65, 67, 92, -28, 97, 100, 81};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain) {
        int max = 0, sum = 0;

        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
