package JAVA.ARRAY;

import java.util.ArrayList;
import java.util.Arrays;

public class merge_twosorted_arrays {
    public static void main(String args[]) {
        int[] arr1 = { 1, 4, 8, 10 };
        int[] arr2 = { 2, 3, 9 };

        ArrayList<Integer> sortedArray = mergeTwoSortedArrays(arr1, arr2);

        System.out.println("sorted array >>> " + sortedArray.toString());

        // mergeTwoSortedArrays2(arr1, arr2);

    }

    private static ArrayList<Integer> mergeTwoSortedArrays(int[] arr1, int[] arr2) {

        ArrayList<Integer> merged = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i <= arr1.length - 1 && j <= arr2.length - 1) {

            if (arr1[i] <= arr2[j]) {
                merged.add(arr1[i++]);
            } else {
                merged.add(arr2[j++]);

            }

            System.out.println("merged " + merged.toString());

        }

        while (i < arr1.length) {
            merged.add(arr1[i++]);

        }

        while (j < arr2.length) {
            merged.add(arr2[j++]);

        }

        return merged;

    }

    private static void mergeTwoSortedArrays2(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int left = n - 1;
        int right = 0;

        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                // System.out.println("swapped");
                // swap
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                // System.out.println("break");
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        System.out.println(Arrays.toString(result));

    }
}
