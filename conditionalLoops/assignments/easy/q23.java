// q23: Input a number and print all the factors of that number (use loops).
package conditionalLoops.assignments.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.println("The factors of " + num + " are " + factors(num));
        in.close();
    }

    static ArrayList<Integer> factors(int num) {
        ArrayList<Integer> facList = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                facList.add(i);
            }
        }
        return facList;
    }
}
