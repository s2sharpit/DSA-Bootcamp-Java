// q3: A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package functions.assignments;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        System.out.println("You are" + (age >= 18 ? "" : " not") + " eligible for vote.");
        
        in.close();
    }
}
