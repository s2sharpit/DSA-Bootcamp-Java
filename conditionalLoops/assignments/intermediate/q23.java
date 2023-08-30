// q23: Check Leap Year Or Not
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        
        String ans = (isLeapYear(year) ? " is" : " is Not") + " a Leap Year";
        System.out.println(year + ans);
        in.close();
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
