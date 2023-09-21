package arrays.assignments.easy;
// https://leetcode.com/problems/maximum-population-year/

public class q19 {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(logs));
    }

    static int maximumPopulation(int[][] logs) {
        int[] year = new int[101];
        for(int[] log: logs){
            year[log[0]-1950]++;
            year[log[1]-1950]--;
        }

        int max = 0;
        for (int i = 0; i < year.length; i++) {
            if(i>0){
                year[i] += year[i-1];
            }
            if(year[i]>year[max]){
                max = i;
            }
        }
        return max+1950;
    }
}
