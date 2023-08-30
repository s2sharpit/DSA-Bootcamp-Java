// q3: Calculate Average Of N Numbers
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q3 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("The average is " + average());
    }

    static double average() {
        System.out.print("Enter the number of numbers: ");
        int n = in.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            sum += in.nextInt();
        }

        return (double) sum / n;
    }
}
