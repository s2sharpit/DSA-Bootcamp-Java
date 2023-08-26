// q1: Write a program to print whether a number is even or odd, also take input from the user.
package firstJava.assignments;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        String ans = num + " is " + (isEven(num) ? "even" : "odd") + " number";
        System.out.println(ans);
        in.close();
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
