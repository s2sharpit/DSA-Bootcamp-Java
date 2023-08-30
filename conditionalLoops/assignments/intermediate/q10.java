// q10: Calculate CGPA Java Program
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = in.nextInt();

        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Course " + i + ":");
            System.out.print("Enter course credits: ");
            double credits = in.nextDouble();

            System.out.print("Enter course grade (in GPA scale, e.g., 4.0): ");
            double grade = in.nextDouble();

            totalCredits += credits;
            totalGradePoints += (credits * grade);
        }

        double cgpa = totalGradePoints / totalCredits;
        System.out.println("Your CGPA is: " + cgpa);
        
        in.close();
    }
}
