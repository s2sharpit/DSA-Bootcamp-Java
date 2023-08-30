// q14: Armstrong Number In Java
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.println((isArmstrong(num) ? " is" : " is not") + " an Armstrong number.");

        in.close();
    }

    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int numDigits = (int) Math.log10(num) + 1;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        return sum == original;
    }
}

