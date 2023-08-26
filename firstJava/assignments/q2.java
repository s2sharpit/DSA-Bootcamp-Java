// q2: Take name as input and print a greeting message for that particular name.
package firstJava.assignments;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name + "!");
        in.close();
    }
}
