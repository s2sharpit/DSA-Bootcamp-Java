// q18: Future Investment Value
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principalAmount = in.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double annualInterestRate = in.nextDouble();

        System.out.print("Enter the number of years: ");
        int numberOfYears = in.nextInt();

        in.close();

        double futureValue = calculateFutureValue(principalAmount, annualInterestRate, numberOfYears);

        System.out.println("Future Investment Value: " + futureValue);
    }

    public static double calculateFutureValue(double principal, double interestRate, int years) {
        double rate = interestRate / 100;
        return principal * Math.pow(1 + rate, years);
    }
}
