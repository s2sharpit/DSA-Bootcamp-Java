package searching.assignments.easy;
// https://leetcode.com/problems/guess-number-higher-or-lower/

public class q2 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(guessNumber(n));
    }
    
    static int guess(int n) {
        int pick = 3;
        if (n > pick) return -1; 
        if (n < pick) return 1;
        return 0; 
    }

    static int guessNumber(int n) {
        int start = 1, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = guess(mid);
            if (res == 0) {
                return mid;
            } else if (res == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
