// q1: Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package functions.assignments;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println("The largest number is: " + largest(a, b, c));
        System.out.println("The smallest number is: " + smallest(a, b, c));

        in.close();
    }

    // static int largest(int a, int b, int c) {
    //     int max = a;
    //     if (b > max) max = b;
    //     if (c > max) max = c;

    //     return max;
    // }

    static int largest(int a, int b, int c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }

    static int smallest(int a, int b, int c) {
        return a < b ? (a < c ? a : c) : (b < c ? b : c);
    }

}
