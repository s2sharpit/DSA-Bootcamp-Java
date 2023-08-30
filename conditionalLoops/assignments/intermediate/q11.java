// q11: Compound Interest Java Program
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = in.nextDouble();

        System.out.print("Enter annual interest rate (as a decimal): ");
        double annualInterestRate = in.nextDouble();

        System.out.print("Enter compounding frequency (per year): ");
        int compoundingFrequency = in.nextInt();

        System.out.print("Enter time period (in years): ");
        double timePeriod = in.nextDouble();

        double compoundInterest = calculateCompoundInterest(principal, annualInterestRate, compoundingFrequency, timePeriod);
        double totalAmount = principal + compoundInterest;

        System.out.println("Compound Interest: " + compoundInterest);
        System.out.println("Total Amount: " + totalAmount);
        
        in.close();
    }

    public static double calculateCompoundInterest(double principal, double annualInterestRate, int compoundingFrequency, double timePeriod) {
        double compoundInterest = principal * Math.pow(1 + annualInterestRate / compoundingFrequency, compoundingFrequency * timePeriod) - principal;
        return compoundInterest;
    }
}

