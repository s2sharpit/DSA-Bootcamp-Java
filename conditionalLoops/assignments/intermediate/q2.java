// q2: Calculate Electricity Bill
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the units consumed: ");
        int units = in.nextInt();
        System.out.println("The electricity bill is " + calculateElectricityBill(units));
        in.close();
    }

    static double calculateElectricityBill(int units) {
        double ratePerUnit;

        if (units <= 50) ratePerUnit = 0.50;
        else if (units <= 100)  ratePerUnit = 0.75;
        else if (units <= 200) ratePerUnit = 1.20;
        else ratePerUnit = 1.50;
        
        return ratePerUnit * units;
    }

    
}
