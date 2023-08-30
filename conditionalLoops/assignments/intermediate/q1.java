// q1: Factorial Program In Java
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.println("The factorial of " + num + " is " + factorial(num));
        in.close();
    }

    static long factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;
        return fact;
    }
}
