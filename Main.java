
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        int[][] arr = { { 1, 2 }, { 2, 6 }, { 8, 11 }, { 2, 7 }, { 12, 15 } };

        int[][] result = mergeOverlapIntervals(arr);

        System.out.println("result >>>> " + Arrays.deepToString(result));

    }

    private static int[][] mergeOverlapIntervals(int[][] arr) {

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> mergedIntervals = new ArrayList<>();

        int[] currentInterval = arr[0];

        mergedIntervals.add(currentInterval);

        for (int[] interval : arr) {

            int currentEnd = currentInterval[1];

            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                currentInterval[1] = nextEnd;
            } else {
                currentInterval = interval;

                mergedIntervals.add(currentInterval);
            }
        }

        return mergedIntervals.toArray((new int[mergedIntervals.size()][]));

    }

}
