// q12: Calculate Average Marks
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = in.nextInt();

        double totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = in.nextDouble();
            totalMarks += marks;
        }

        double averageMarks = totalMarks / numSubjects;
        System.out.println("Average Marks: " + averageMarks);

        in.close();
    }
}
