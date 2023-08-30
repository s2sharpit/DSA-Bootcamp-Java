// Volume Of Cone, Prism, Cylinder, Sphere, Pyramid
package conditionalLoops.assignments;

import java.util.Scanner;

public class q14_18 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("1. Cone");
        System.out.println("2. Prism");
        System.out.println("3. Cylinder");
        System.out.println("4. Sphere");
        System.out.println("5. Pyramid");
        System.out.print("Enter the number corresponding to the volume you want to calculate: ");
        
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the height & radius of cone: ");
                System.out.println("The volume of cone is: " + cone());
                break;
            case 2:
                System.out.print("Enter the height & base of prism: ");
                System.out.println("The volume of prism is: " + prism());
                break;
            case 3:
                System.out.print("Enter the height & radius of cylinder: ");
                System.out.println("The volume of cylinder is: " + cylinder());
                break;
            case 4:
                System.out.print("Enter the radius of sphere: ");
                System.out.println("The volume of sphere is: " + sphere());
                break;
            case 5:
                System.out.print("Enter the height & base of pyramid: ");
                System.out.println("The volume of pyramid is: " + pyramid());
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    static double cone() {
        int height = in.nextInt();
        int r = in.nextInt();
        return Math.PI * r * r * height / 3;
    }

    static double prism() {
        int height = in.nextInt();
        int base = in.nextInt();
        return base * height;
    }

    static double cylinder() {
        int height = in.nextInt();
        int r = in.nextInt();
        return Math.PI * r * r * height;
    }

    static double sphere() {
        int r = in.nextInt();
        return 4 * Math.PI * r * r * r / 3;
    }

    static double pyramid() {
        int height = in.nextInt();
        int base = in.nextInt();
        return base * base * height / 3;
    }
}
