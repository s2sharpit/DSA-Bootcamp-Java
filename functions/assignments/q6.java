// q6: Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package functions.assignments;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius of a circle: ");
        int r = in.nextInt();

        in.close();

        System.out.println("Circumference: " + circumference(r));
        System.out.println("Area: " + area(r));
    }

    static double circumference(int r) {
        return 2 * Math.PI * r;
    }

    static double area(int r) {
        return Math.PI * r * r;
    }
}
