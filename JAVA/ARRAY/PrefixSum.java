package JAVA.ARRAY;

import java.util.Arrays;

public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };

        prefixSumArray(arr);
    }

    private static void prefixSumArray(int[] arr) {

        System.out.println(Arrays.toString(arr));
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0]; // initialize sum

        for (int i = 1; i < arr.length; i++) {

            prefixSum[i] = prefixSum[i - 1] + arr[i];

        }

        System.out.println(Arrays.toString(prefixSum));

        int subArraySum;

        int m = 2;
        int n = 4;

        if (m == 0) {
            subArraySum = prefixSum[n];
        } else {
            subArraySum = prefixSum[n] - prefixSum[m - 1];
        }

        System.out.println("sum from M to N is " + subArraySum);
    }

}
