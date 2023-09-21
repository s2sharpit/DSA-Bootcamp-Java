package arrays.assignments.easy;
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.*;

public class q6 {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;

        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        System.out.println(ans);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();

        int max = candies[0];

        for (int candy : candies) {
            max = Math.max(candy, max);
        }

        for (int candy : candies) {
            ans.add(candy + extraCandies >= max);
        }

        return ans;
    }
}