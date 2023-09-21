package arrays.assignments.easy;
// https://leetcode.com/problems/richest-customer-wealth/

public class q4 {
    public static void main(String[] args) {
        int[][] accounts = {
            { 1, 2, 3 },
            { 3, 2, 1 }
        };
        
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account : person) {
                sum += account;
            }

            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans)
                ans = sum;
        }
        return ans;
    }
}
