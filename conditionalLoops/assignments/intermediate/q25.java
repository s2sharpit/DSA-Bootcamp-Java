// q25: Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
package conditionalLoops.assignments.intermediate;

public class q25 {
    public static void main(String[] args) {        
        int daysInAugust = 31;
        System.out.println("Number of days Kunal can go out in August: " + countEvenDaysInMonth(daysInAugust));
    }

    // static int countEvenDaysInMonth(int days) {
    //     int evenDays = 0;
    //     for (int i = 1; i <= days; i++) {
    //         if (i % 2 == 0) {
    //             evenDays++;
    //         }
    //     }
    //     return evenDays;
    // }

    static int countEvenDaysInMonth(int days) {
        int evenDays = days / 2;
        return evenDays;
    }
}
