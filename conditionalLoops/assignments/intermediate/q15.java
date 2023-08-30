// q15: Find nCr & nPr
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        System.out.print("Enter the value of r: ");
        int r = in.nextInt();

        in.close();

        if (n > r) {
            System.out.println("nCr (" + n + "C" + r + ") = " + nCr(n, r));
            System.out.println("nPr (" + n + "P" + r + ") = " + nPr(n, r));
        } else {
            System.out.println("n must be greater than or equal to r");
        }
    }

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    static int nPr(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    static int nCr(int n, int r) {
        return nPr(n, r) / factorial(r);
    }
}
