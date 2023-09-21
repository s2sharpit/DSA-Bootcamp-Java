// q26: Addition Of Two Numbers
package conditionalLoops.assignments.easy;

import java.util.Scanner;

public class q26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int sum = in.nextInt() + in.nextInt();
        System.out.println("The sum is " + sum);
        in.close();
    }
}
