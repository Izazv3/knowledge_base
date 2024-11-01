package JAVA.ARRAY;

import java.util.*;

public class next_permutation {

    public static void main(String args[]) {
        int[] arr = { 1, 3, 2 };
        nextPermutation(arr);
        System.out.println("Next permutation : " + Arrays.toString(arr));
    }

    private static void nextPermutation(int[] arr) {

        int n = arr.length;
        int i = n - 2;

        if (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {

            int j = n - 1;

            while (arr[j] <= arr[i]) {

                j--;

            }

            swap(arr, i, j);

        }

        reverse(arr, i + 1, n - 1);

    }

    private static void reverse(int[] arr, int i, int j) {

        while (i < j) {

            swap(arr, i, j);

            i++;
            j--;

        }

    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];

        arr[i] = arr[j];

        arr[j] = temp;

    }

}
