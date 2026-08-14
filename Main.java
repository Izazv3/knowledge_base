
import java.util.Arrays;

public class Main {

    public static void main(String args[]) {

        int[] arr2 = { 2, 9, 1, 4, 5, 8, 0 };

        sortArray(arr2);

        System.out.println(Arrays.toString(arr2));

    }

    private static void sortArray(int[] arr) {

        for (int idx = 0; idx < arr.length - 1; idx++) {

            int minIndex = idx;

            for (int j = idx + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != idx) {
                int temp = arr[idx];

                arr[idx] = arr[minIndex];

                arr[minIndex] = temp;
            }

        }
    }

}
