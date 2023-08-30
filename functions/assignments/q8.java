// Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
package functions.assignments;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = in.nextInt();

        in.close();

        System.out.println("Your grade is " + getGrade(marks));
    }

    // static char getGrade(int marks) {
    //     if (marks >= 91)
    //         return 'A';
    //     else if (marks >= 81)
    //         return 'B';
    //     else if (marks >= 71)
    //         return 'C';
    //     else if (marks >= 61)
    //         return 'D';
    //     else if (marks >= 51)
    //         return 'E';
    //     else
    //         return 'F';
    // }

    static char getGrade(int marks) {
        char ch;
        switch (marks / 10) {
            case 10 -> ch = 'A';
            case 9 -> ch = 'A';
            case 8 -> ch = 'B';
            case 7 -> ch = 'C';
            case 6 -> ch = 'D';
            case 5 -> ch = 'E';
            default -> ch = 'F';
        }
        return ch;
    }
}
