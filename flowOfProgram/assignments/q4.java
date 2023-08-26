// q4: Take 2 numbers as inputs and find their HCF and LCM.
package flowOfProgram.assignments;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("HCF: " + HCF(a, b));
        System.out.println("LCM: " + LCM(a, b));
        in.close();    }
    
    // static int HCF(int a, int b) {
    //     int hcf = 1;
    //     for (int i = 1; i <= Math.min(a, b); i++) {
    //         if (a % i == 0 && b % i == 0)
    //             hcf = i;
    //     }
    //     return hcf;
    // }

    // static int HCF(int a, int b) {
    //     while (b != 0) {
    //         int temp = b;
    //         b = a % b;
    //         a = temp;
    //     }
    //     return a;
    // }

    static int HCF(int a, int b) {
        if (b == 0)
            return a;
        return HCF(b, a % b);
    }

    // static int LCM(int a, int b) {
    //     int max = Math.max(a, b);
    //     while (true) {
    //         if (max % a == 0 && max % b == 0)
    //             return max;
    //         max++;
    //     }
    // }

    // static int LCM(int a, int b) {
    //     int max = Math.max(a, b);
    //     int lcm = max;

    //     while (true) {
    //         if (lcm % a == 0 && lcm % b == 0)
    //             return lcm;
    //         lcm += max;
    //     }
    // }

    static int LCM(int a, int b) {
        return (a * b) / HCF(a, b);
    }
}
