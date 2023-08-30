// q9: Calculate Batting Average
package conditionalLoops.assignments.intermediate;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter total runs scored: ");
        double totalRunsScored = in.nextDouble();

        System.out.print("Enter total number of times out: ");
        int totalTimesOut = in.nextInt();

        double battingAverage = battingAverage(totalRunsScored, totalTimesOut);
        System.out.println("Batting Average: " + battingAverage);
        
        in.close();
    }

    public static double battingAverage(double totalRunsScored, int totalTimesOut) {
        if (totalTimesOut == 0) {
            return 0; // To handle cases where the player has not been out yet
        }
        return totalRunsScored / totalTimesOut;
    }
}
