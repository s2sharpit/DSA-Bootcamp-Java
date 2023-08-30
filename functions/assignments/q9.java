// Write a program to print the factorial of a number by defining a method named 'Factorial'. 
package functions.assignments;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        in.close();

        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    // static long factorial(int num) {
    //     int fact = 1;
    //     for (int i = 1; i <= num; i++) fact *= i;
    //     return fact;
    // }

    static long factorial(int num) {
        if (num == 0) return 1;
        return num * factorial(num - 1);
    }
}
