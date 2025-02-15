package JAVA.RECURSION;

import java.util.Arrays;

public class ArrayPermutation {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        permute(arr, 0);

    }

    private static void permute(int[] arr, int index) {
        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));

            return;
        }

        for (int i = index; i < arr.length; i++) {

            swap(arr, i, index);
            permute(arr, index + 1);
            swap(arr, i, index);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
