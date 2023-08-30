// q8: Calculate Depreciation of Value
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the initial cost of the asset: ");
        double initialCost = in.nextDouble();

        System.out.print("Enter the estimated residual value: ");
        double residualValue = in.nextDouble();

        System.out.print("Enter the useful life (in years): ");
        int usefulLife = in.nextInt();

        double depreciation = (initialCost - residualValue) / usefulLife;
        System.out.println("Depreciation per year: " + depreciation);
        
        in.close();
    }
}