// q7: Define a method to find out if a number is prime or not.
// https://www.geeksforgeeks.org/java-prime-number-program/
package functions.assignments;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        in.close();

        System.out.println(n + " is " + (isPrime(n) ? "" : "not ") + "a prime number.");
    }

    // static boolean isPrime(int n) {
    //     if (n <= 1)
    //         return false;
        
    //     for (int i = 2; i <= Math.sqrt(n); i++)
    //         if (n % i == 0)
    //             return false;

    //     return true;
    // }

    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i < Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
