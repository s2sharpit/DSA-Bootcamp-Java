// q13: Sum Of N Numbers
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = in.nextInt();

        int sum = calculateSum(N);
        System.out.println("Sum of the first " + N + " natural numbers: " + sum);

        in.close();
    }

    public static int calculateSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }
}

