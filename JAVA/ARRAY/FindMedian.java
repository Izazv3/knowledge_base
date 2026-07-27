package JAVA.ARRAY;

import java.util.Arrays;

public class FindMedian {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 0, 3, 6, 5 };

        int median = findMedian(arr);

        System.out.println(median);
    }

    private static int findMedian(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;

        return arr[n / 2];

    }

}
