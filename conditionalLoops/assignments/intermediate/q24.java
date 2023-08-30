// q24: Sum Of A Digits Of Number
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q24 {

    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);

        in.close();
    }
    
}
