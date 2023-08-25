package linearSearch;
// https://leetcode.com/problems/richest-customer-wealth/
public class maxWealth {
    public static void main(String[] args) {
        
    }

    static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
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
