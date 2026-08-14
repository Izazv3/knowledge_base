package JAVA.ARRAY;

import java.util.Arrays;

public class rotateArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        int k = 3;

        rotateLeft(arr, k);// rotate by k elements

        System.out.println(Arrays.toString(arr));

    }

    private static void reverseArray(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];

            arr[left] = arr[right];

            arr[right] = temp;

            left++;
            right--;
        }

    }

    private static void rotateLeft(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
        reverseArray(arr, 0, n - 1);

    }

    private static void rotateRight(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);

    }

}
