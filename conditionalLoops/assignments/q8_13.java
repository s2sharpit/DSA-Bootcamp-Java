// q8_13: Perimeter Of Circle, Equilateral Triangle, Parallelogram, Rectangle, Square, Rhombus
package conditionalLoops.assignments;

import java.util.Scanner;

public class q8_13 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("1. Circle");
        System.out.println("2. Equilateral Triangle");
        System.out.println("3. Parallelogram");
        System.out.println("4. Rectangle");
        System.out.println("5. Rhombus");
        System.out.println("6. Square");
        System.out.print("Enter the number corresponding to the perimeter you want to calculate: ");

        int choice = in.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of circle: ");
                System.out.println("The perimeter of circle is: " + circle());
                break;
            case 2:
                System.out.print("Enter the side of equilateral triangle: ");
                System.out.println("The perimeter of equilateral triangle is: " + equilateralTriangle());
                break;
            case 3:
                System.out.print("Enter the length & breadth of parallelogram: ");
                System.out.println("The area of parallelogram is: " + parallelogram());
                break;
            case 4:
                System.out.print("Enter the length & breadth of rectangle: ");
                System.out.println("The area of rectangle is: " + parallelogram());
                break;
            case 5:
                System.out.print("Enter the side of rhombus: ");
                System.out.println("The area of rhombus is: " + rhombus());
                break;
            case 6:
                System.out.print("Enter the side of square: ");
                System.out.println("The area of square is: " + rhombus());
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    
    static double circle() {
        int r = in.nextInt();
        return 2 * Math.PI * r;
    }

    static int equilateralTriangle() {
        int side = in.nextInt();
        return side * 3;
    }

    static int parallelogram() {
        return 2 * (in.nextInt() + in.nextInt());
    }

    static int rhombus() {
        return 4 * in.nextInt();
    }
}
