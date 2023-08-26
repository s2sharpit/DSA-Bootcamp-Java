// q4: Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package firstJava.assignments;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers with an operator (+, -, *, /) in between them: ");
        int a = in.nextInt();
        char operator = in.next().charAt(0);
        int b = in.nextInt();
        in.close();

        double result = calculate(a, b, operator);
        System.out.println("Result: " + result);
    }

    static double calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return (double) a / b; // Use double division to handle fractions
                } else {
                    System.out.println("Cannot divide by zero.");
                    return Double.NaN; // Return NaN (Not-a-Number) for division by zero
                }
            default:
                System.out.println("Invalid operator.");
                return Double.NaN; // Return NaN for invalid operator
        }
    }
}
