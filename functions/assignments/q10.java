// Write a function to find if a number is a palindrome or not. Take number as parameter.
// https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/
package functions.assignments;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        in.close();

        System.out.println(num + (isPalindrome(num) ? " is" : " is not") + " a Palindrome number.");
    }

    static boolean isPalindrome(int n) {
        int reverse = 0, temp = n;
        
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == n);
    }
}
