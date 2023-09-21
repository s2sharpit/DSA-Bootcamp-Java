// q24: Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
package conditionalLoops.assignments.easy;

import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter the number (enter 0 to exit): ");
            int num = in.nextInt();
            if (num == 0) break;
            sum += num;
        }
        System.out.println("The sum of all the numbers is " + sum);
        in.close();
    }
}
