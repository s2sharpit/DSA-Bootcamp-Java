// q2: Take two numbers and print the sum of both.
package flowOfProgram.assignments;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
        in.close();
    }
}
