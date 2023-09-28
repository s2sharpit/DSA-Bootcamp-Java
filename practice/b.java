package practice;
// https://leetcode.com/problems/find-the-difference/?envType=daily-question&envId=2023-09-25

public class b {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    static char findTheDifference(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    // System.out.println(t.charAt(i) + ", " + s.charAt(j));
                    break;
                }
                if (j == s.length() - 1)
                    return t.charAt(i);
            }
        }
        return 'a';
    }
}
