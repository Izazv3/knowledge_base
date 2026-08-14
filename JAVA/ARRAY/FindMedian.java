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

    private static void sortArray(int[] arr) {
        int n = arr.length;

        // selection sort

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }

            if (minIndex != i) {

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
    }

}
