package arrays.assignments.easy;
// https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.List;

public class q11 {
    public static void main(String[] args) {
    }

    // static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    //     int res = 0;

    //     for (int i = 0; i < items.size(); i++) {
    //         if (ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
    //             res++;
    //         if (ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue))
    //             res++;
    //         if (ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue))
    //             res++;
    //     }

    //     return res;
    // }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        int index = 0;

        // if (ruleKey.equals("type")) index = 0;
        if (ruleKey.equals("color")) index = 1;
        if (ruleKey.equals("name")) index = 2;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(ruleValue))
                res++;
        }

        return res;
    }
}
