// q21: Java Program Vowel Or Consonant
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = in.next().charAt(0);

        in.close();

        if (isAlphabet(input)) {
            System.out.println("'" + input + "' is a " + (isVowel(input) ? "vowel." : "consonant."));
        } else {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }
    }

    public static boolean isAlphabet(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
