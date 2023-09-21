// Curved Surface Area Of Cylinder, Total Surface Area Of Cylinder, Surface Area Of Cube
package conditionalLoops.assignments.easy;

import java.util.Scanner;

public class q19_20 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("1. Curved Surface Area Of Cylinder");
        System.out.println("2. Total Surface Area Of Cylinder");
        System.out.println("3. Surface Area Of Cube");
        System.out.print("Enter the number corresponding to the area you want to calculate: ");

        int choice = in.nextInt();

        switch (choice) {
            case 1 -> System.out.println("The curved surface area of cylinder is: " + CSAofCylinder());
            case 2 -> System.out.println("The total surface area of cylinder is: " + TSAofCylinder());
            case 3 -> System.out.println("The surface area of cube is: " + SAofCube());
            default -> System.out.println("Invalid Input");
        }
    }

    static double CSAofCylinder() {
        System.out.print("Enter the height and radius of cylinder: ");
        int height = in.nextInt();
        int r = in.nextInt();
        return 2 * Math.PI * r * height;
    }

    static double TSAofCylinder() {
        System.out.print("Enter the height and radius of cylinder: ");
        int height = in.nextInt();
        int r = in.nextInt();
        return 2 * Math.PI * r * (height + r);
    }

    static int SAofCube() {
        System.out.print("Enter the side of cube: ");
        int side = in.nextInt();
        return 6 * side * side;
    }
}
