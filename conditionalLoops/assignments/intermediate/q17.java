// q17: Find if a number is palindrome or not
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();

        System.out.println(num + (isPalindrome(num) ? " is" : " is not") + " a Palindrome number.");
    }

    static boolean isPalindrome(int num) {
        int temp = num, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == num;
    }
}
