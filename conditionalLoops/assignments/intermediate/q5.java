// q5: Calculate Distance Between Two Points
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the coordinates of the first point: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.print("Enter the coordinates of the second point: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        System.out.println("The distance between the two points is " + distance(x1, y1, x2, y2));
        in.close();
    }

    static double distance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
