// q5: Define a method that returns the product of two numbers entered by user.
package functions.assignments;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        int product = product(a, b);
        System.out.println("Product of " + a + " & " + b + " is: " + product);
    }

    static int product(int a, int b) {
        return a * b;
    }
}
