package searching.assignments.medium;
// https://leetcode.com/problems/find-right-interval/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class q7 {
    public static void main(String[] args) {
        int[][] intervals = {{3,4},{2,3},{1,2}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }

    static int[] findRightInterval(int[][] intervals) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int i=0;
        for(int[] interval: intervals)
            indexMap.put(interval[0], i++);
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int[] result = new int[intervals.length];
        for(i=0; i<intervals.length; i++)
            result[indexMap.get(intervals[i][0])] = indexMap.getOrDefault(search(intervals, intervals[i][1]), -1);
        return result;
    }
    
    static Integer search(int[][] intervals, int num){
        int lo=0, hi=intervals.length-1;
        if (num > intervals[hi][0]) return null;
        
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(num == intervals[mid][0]) 
                return intervals[mid][0];
            if (num > intervals[mid][0])
                lo = mid + 1;
            else hi = mid - 1;
        }
        return intervals[lo][0];
    }
}
