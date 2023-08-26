// q6: Input currency in rupees and output in USD.
package firstJava.assignments;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount in Rs: ");
        int Rs = in.nextInt();
        System.out.println("Amount in USD: " + toUSD(Rs));
        in.close();
    }

    static float toUSD(int Rs) {
        return Rs / 82.55f;
    }
}
