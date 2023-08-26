// q9: To find Armstrong Number between two given number.
package firstJava.assignments;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range of numbers (start end): ");
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + ", ");
            }
        }

        in.close();
    }

    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        // int numDigits = String.valueOf(num).length();
        int numDigits = (int) Math.log10(num) + 1;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        return sum == original ;
    }
}
