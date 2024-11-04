package JAVA.ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class overlap_subinterval {
    public static void main(String args[]) {
        int[][] intervals = { { 1, 2 }, { 2, 6 }, { 8, 11 }, { 2, 7 }, { 12, 15 } };
        int[][] result = mergeOverlappingSubIntervals(intervals);

        printIntervals(result);

    }

    public static void printIntervals(int[][] intervals) {
        System.out.println("***********************");
        for (int i = 0; i < intervals.length; i++)
            System.out.println(Arrays.toString(intervals[i]));

        System.out.println("***********************");

    }

    private static int[][] mergeOverlappingSubIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        printIntervals(intervals);

        List<int[]> mergedIntervals = new ArrayList<>();

        int[] currentInterval = intervals[0];

        mergedIntervals.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];

            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }

        }

        return mergedIntervals.toArray((new int[mergedIntervals.size()][]));
    }
}
