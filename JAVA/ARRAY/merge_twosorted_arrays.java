package JAVA.ARRAY;

import java.util.Arrays;

public class merge_twosorted_arrays {
    public static void main(String args[]) {
        int[] arr1 = { 1, 4, 8, 10 };
        int[] arr2 = { 2, 3, 9 };

        mergeTwoSortedArrays(arr1, arr2);

        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

    private static void mergeTwoSortedArrays(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int left = n - 1;
        int right = 0;

        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                System.out.println("swapped");
                // swap
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                System.out.println("break");
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }
}
