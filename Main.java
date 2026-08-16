import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 0, 6, 5, 7, 4 };

        selectionSort(arr);

        findMedian(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void findMedian(int[] arr) {
        int n = arr.length;

        System.out.println("median is " + arr[n / 2]);
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

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
