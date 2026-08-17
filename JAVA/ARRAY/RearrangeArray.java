package JAVA.ARRAY;

import java.util.Arrays;
import static java.util.Arrays.sort;

public class RearrangeArray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 4, 6, 7 };

        rearrangeArray(arr); // largest -> smallest -> second largest -> second samellest ...

    }

    private static void rearrangeArray(int[] arr) {

        int[] result = new int[arr.length];

        sort(arr); // use selection sort

        int left = 0;
        int right = arr.length - 1;

        int index = 0;

        while (left <= right) {

            result[index++] = arr[right--];

            if (left <= right) {
                result[index++] = arr[left++];

            }

        }

        System.out.println(Arrays.toString(result));

    }

}
