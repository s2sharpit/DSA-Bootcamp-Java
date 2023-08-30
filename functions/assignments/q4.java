// q4: Write a program to print the sum of two numbers entered by user by defining your own method.
package functions.assignments;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        int sum = add(a, b);
        System.out.println("Sum of " + a + " & " + b + " is: " + sum);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
