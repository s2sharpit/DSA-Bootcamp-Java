// q6: Calculate Commission Percentage
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total sales: ");
        double sales = in.nextDouble();
        System.out.print("Enter the commission rate: ");
        double rate = in.nextDouble();
        System.out.println("The commission is: " + (sales * rate / 100) + " %");
        in.close();
    }
}
