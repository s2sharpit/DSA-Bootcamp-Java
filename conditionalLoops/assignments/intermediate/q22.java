// q22: Perfect Number In Java
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        in.close();

        System.out.println(n + (isPerfect(n) ? " is" : " is not") + " a perfect number.");
    }

    public static boolean isPerfect(int n) {
        if (n <= 0) {
            return false;
        }
        
        int sum = 0;
        for (int i = 1; i <= n / 2; ++i) {
            if (n % i == 0)
                sum += i;
        }
        return sum == n;
    }
}
