package arrays.assignments.easy;
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class q10 {
    public static void main(String[] args) {
        // String s = "thequickbrownfoxjumpsoverthelazydog";
        String s = "leetcode";
        System.out.println(checkIfPangram(s));

    }

    // static boolean checkIfPangram(String sentence) {
    //     int[] count = new int[26];
        
    //     for (int i=0; i<sentence.length(); i++) {
    //         count[sentence.charAt(i) - 'a']++;
    //     }

    //     for (int val: count) {
    //         if (val == 0) return false;
    //     }
    //     return true;
    // }

    static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            if (sentence.indexOf(i) == -1) {
                return false;
            }
        }
        return true;
    }
}
