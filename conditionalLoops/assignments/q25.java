// q25: Take integer inputs till the user enters 0 and print the largest number from all.
package conditionalLoops.assignments;

import java.util.Scanner;

public class q25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter the number (enter 0 to exit): ");
            int num = in.nextInt();
            if (num == 0) break;
            if (num > max) max = num;
        }
        System.out.println("The largest number is " + max);
        in.close();
    }
}
