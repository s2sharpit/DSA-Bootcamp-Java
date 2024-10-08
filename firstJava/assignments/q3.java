// q3: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package firstJava.assignments;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal, time, and rate: ");
        double P = in.nextDouble();
        double T = in.nextDouble();
        double R = in.nextDouble();
        System.out.println("Simple Interest: " + SI(P, T, R));
        in.close();
    }

    static double SI(double P, double T, double R) {
       return (P * T * R) / 100;
    }
}
