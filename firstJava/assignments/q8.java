// q8: To find out whether the given String is Palindrome or not.
package firstJava.assignments;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        String ans = "It is " + (isPalindrome(str) ? "" : "not ") + "a palindrome.";
        System.out.println(ans);
        in.close();
    }

    static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
