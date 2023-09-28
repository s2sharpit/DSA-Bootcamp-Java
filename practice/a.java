package practice;
// https://leetcode.com/problems/is-subsequence/?envType=daily-question&envId=2023-09-22

public class a {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j++))
                i++;
        }
        return i == s.length();
    }
}