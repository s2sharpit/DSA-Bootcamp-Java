// q4: Calculate Discount Of Product
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the product: ");
        double price = in.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discount = in.nextDouble();
        System.out.println("The discounted price is " + discountedPrice(price, discount));
        in.close();
    }

    static double discountedPrice(double price, double discount) {
        return price - (price * discount / 100);
    }
}
