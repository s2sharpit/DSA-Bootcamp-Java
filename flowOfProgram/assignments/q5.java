// q5: Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package flowOfProgram.assignments;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number (or 'x' to exit): ");
            String input = in.nextLine();
            if (input.equals("x")) {
                break;
            }
            try { 
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid input.");
            }
        }
        System.out.println("Sum of all numbers: " + sum);
        in.close();
    }
}
