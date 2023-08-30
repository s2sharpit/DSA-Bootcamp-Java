// q7: Power In Java
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = in.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = in.nextInt();

        double result = calculatePower(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);

        in.close();
    }

    public static double calculatePower(double base, int exponent) {
        double result = 1;

        if (exponent >= 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        } else {
            for (int i = 0; i > exponent; i--) {
                result /= base;
            }
        }

        return result;
    }

}
