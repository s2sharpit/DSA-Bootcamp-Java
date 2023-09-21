package arrays.assignments.easy;
// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/

public class q28 {
    public static void main(String[] args) {
        int[] position = {1,2,3};
        System.out.println(minCostToMoveChips(position));
    }

    static int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for(int i: position) {
            if(i % 2 == 0) even++;
            else odd++;
        }
        return Math.min(even, odd);
    }
}
