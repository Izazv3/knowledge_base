package JAVA.ARRAY;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 0, 8, 0, 5, 6 };

        moveZeros2(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void moveZeros(int[] arr) {

        int nonZeroCount = 0;
        for (int idx = 0; idx < arr.length; idx++) {

            if (arr[idx] != 0) {
                arr[nonZeroCount] = arr[idx];
                nonZeroCount++;
            }

        }

        for (int i = nonZeroCount; i < arr.length; i++) {

            arr[i] = 0;

        }
    }

    private static void moveZeros2(int[] arr) {

        int j = 0;
        for (int idx = 0; idx < arr.length; idx++) {

            if (arr[idx] != 0) {
                int temp = arr[idx];

                arr[idx] = arr[j];

                arr[j] = temp;
                j++;
            }

        }

    }

}
