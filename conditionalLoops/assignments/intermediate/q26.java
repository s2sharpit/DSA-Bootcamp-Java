// q26: Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        // while (true) {
        //     System.out.print("Enter a number (0 to exit): ");
        //     int number = in.nextInt();

        //     if (number == 0) {
        //         break;
        //     } else if (number < 0) {
        //         negativeSum += number;
        //     } else if (number % 2 == 0) {
        //         positiveEvenSum += number;
        //     } else {
        //         positiveOddSum += number;
        //     }
        // }

        int number;
        do {
            System.out.print("Enter a number (0 to exit): ");
            number = in.nextInt();

            if (number < 0) {
                negativeSum += number;
            } else if (number % 2 == 0) {
                positiveEvenSum += number;
            } else if (number != 0) {
                positiveOddSum += number;
            }
        } while (number != 0);

        in.close();

        System.out.println("Sum of negative numbers: " + negativeSum);
        System.out.println("Sum of positive even numbers: " + positiveEvenSum);
        System.out.println("Sum of positive odd numbers: " + positiveOddSum);
    }
}
