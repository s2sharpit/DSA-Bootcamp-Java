// Write a function that returns all prime numbers between two given numbers.
// https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/
package functions.assignments;

import java.util.*;

public class q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int lowerBound = in.nextInt();

        System.out.print("Enter the upper bound: ");
        int upperBound = in.nextInt();

        in.close();

        List<Integer> primeNumbers = primesRange(lowerBound, upperBound);

        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ": " + primeNumbers);
    }

    static List<Integer> primesRange(int lowerBound, int upperBound) {
        List<Integer> primeNumbers = new ArrayList<>();

        if (lowerBound <= 2) {
            primeNumbers.add(2);
            lowerBound = 3;
        }
        if (lowerBound % 2 == 0) {
            lowerBound++;
        }

        for (int num = lowerBound; num <= upperBound; num += 2) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
        }

        return primeNumbers;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

}
