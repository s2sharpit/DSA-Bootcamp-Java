// Fibonacci Series In Java Programs
package conditionalLoops.assignments.easy;

import java.util.*;

public class q21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number till which you want to generate the Fibonacci series: ");
        int n = in.nextInt();
        System.out.println("Fibonacci series up to " + n + ": " + fibonacci(n));
        in.close();
    }

    static ArrayList<Integer> fibonacci(int maxNum) {
        ArrayList<Integer> fib = new ArrayList<Integer>();
        fib.add(0);
        fib.add(1);
        int size = fib.size();
        int sum = fib.get(0) + fib.get(1);
        
        while (sum <= maxNum) {
            fib.add(sum);
            size = fib.size();
            sum = fib.get(size - 1) + fib.get(size - 2);
        }
        
        return fib;
    }
}
