// q5: Take 2 numbers as input and print the largest number.
package firstJava.assignments;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("The largest number is: " + findMax(a, b));
        in.close();

    }

    static int findMax(int a, int b) {
        return a > b ? a : b;
    }
}
