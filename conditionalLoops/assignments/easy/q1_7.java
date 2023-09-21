// q1_7: Area Of Circle, Triangle, Rectangle, Isosceles Triangle, Parallelogram, Rhombus, Equilateral Triangle
package conditionalLoops.assignments.easy;

import java.util.Scanner;

public class q1_7 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("4. Isosceles Triangle");
        System.out.println("5. Parallelogram");
        System.out.println("6. Rhombus");
        System.out.println("7. Equilateral Triangle");
        System.out.print("Enter the number corresponding to the area you want to calculate: ");
        
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of circle: ");
                System.out.println("The area of circle is: " + circle());
                break;
            case 2:
                System.out.print("Enter the base & height of triangle: ");
                System.out.println("The area of triangle is: " + parallelogram() * 0.5);
                break;
            case 3:
                System.out.print("Enter the length & breadth of rectangle: ");
                System.out.println("The area of rectangle is: " + parallelogram());
                break;
            case 4:
                System.out.print("Enter the base & height of isosceles triangle: ");
                System.out.println("The area of isosceles triangle is: " + parallelogram() * 0.5);
                break;
            case 5:
                System.out.print("Enter the base & height of parallelogram: ");
                System.out.println("The area of parallelogram is: " + parallelogram());
                break;
            case 6:
                System.out.print("Enter the base & height of rhombus: ");
                System.out.println("The area of rhombus is: " + parallelogram());
                break;
            case 7:
                System.out.print("Enter the side of equilateral triangle: ");
                System.out.println("The area of equilateral triangle is: " + equilateralTriangle());
                break;
            default:
                System.out.println("Invalid Input");
        }

    }

    static double circle() {
        int r = in.nextInt();
        return Math.PI * r * r;
    }

    static int parallelogram() {
        return in.nextInt() * in.nextInt();
    }

    static double equilateralTriangle() {
        int side = in.nextInt();
        return 0.433 * side * side;
    }
}
