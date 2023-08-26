// q7: To calculate Fibonacci Series up to n numbers.
package firstJava.assignments;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        Fibonacci(n);
        in.close();
    }

    static void Fibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
