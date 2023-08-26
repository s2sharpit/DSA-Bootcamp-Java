// q3: Take a number as input and print the multiplication table for it.
package flowOfProgram.assignments;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
        in.close();
    }
}
