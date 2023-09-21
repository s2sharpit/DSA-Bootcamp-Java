package conditionalLoops.assignments.easy;
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.println("The difference between the product and sum of digits of " + n + " is " + subtract(n));
        in.close();
    }

    static int subtract(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return product - sum;
    }
}
