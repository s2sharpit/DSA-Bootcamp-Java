// Write a function that returns the sum of first n natural numbers.
// https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/
package functions.assignments;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        int sum = calculateSum(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);

        in.close();
    }

    static int calculateSum(int n) {
        // return n * (n + 1) / 2;
        // The above program causes overflow, even if the result is not beyond the integer limit. We can avoid overflow up to some extent by dividing first.

        if (n % 2 == 0)
            return (n / 2) * (n + 1);
        else
            return ((n + 1) / 2) * n;
    }
}
