package Leetcodes;

import java.util.Arrays;

public class NonOverlappingIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};

        eraseOverlapIntervals(intervals);
    }



    public static  int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int previous = 0;
        int count = 1;

        for(int i = 1 ; i < n ; i++)
        {
            if(intervals[i][0] >= intervals[previous][1])
            {
                previous = i;
                count++;
            }
        }

        return n - count;

    }
}
