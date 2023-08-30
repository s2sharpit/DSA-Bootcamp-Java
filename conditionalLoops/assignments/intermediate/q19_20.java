// q19_20: HCF & LCM Of Two Numbers Program
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q19_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("HCF: " + HCF(a, b));
        System.out.println("LCM: " + LCM(a, b));

        in.close();
    }

    static int HCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int LCM(int a, int b) {
        return (a * b) / HCF(a, b);
    }
}