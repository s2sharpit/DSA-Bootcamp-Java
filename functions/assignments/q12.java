// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
// https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/
package functions.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = in.nextInt();
        }

        in.close();

        System.out.println((isTriplet(arr, arr.length) ? "Yes" : "No"));
    }

    static boolean isTriplet(int[] arr, int n) {
        // Square array elements
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] * arr[i];
 
        // Sort array elements
        Arrays.sort(arr);
        
        for (int i = n - 1; i >= 2; i--) {
            int l = 0; // index of the first element in arr[0..i-1]
            int r = i - 1; // index of the last element in arr[0..i-1]
            while (l < r) {
                // A triplet found
                if (arr[l] + arr[r] == arr[i])
                    return true;

                // Else either move 'l' or 'r'
                if (arr[l] + arr[r] < arr[i])
                    l++;
                else
                    r--;
            }
        }

        // If we reach here, then no triplet found
        return false;
    }
}
