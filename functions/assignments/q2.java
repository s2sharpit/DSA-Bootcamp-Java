// q2: Define a program to find out whether a given number is even or odd.
// https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/
package functions.assignments;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        String ans = num + " is " + (isEven(num) ? "even" : "odd") + " number";
        System.out.println(ans);
        in.close();
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
