// q16: Reverse A String In Java
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.nextLine();

        System.out.println("Reversed string: " + stringReverse(str));

        in.close();
    }

    static String stringReverse(String str) {
        char[] charArray = str.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);
    }
}
