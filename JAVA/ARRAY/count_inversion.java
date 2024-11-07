package JAVA.ARRAY;

import java.util.ArrayList;

public class count_inversion {

    public static void main(String args[]) {
        int[] arr = { 5, 3, 2, 1, 4 };
        // int res = countInversion(arr);
        int res = mergeSort(arr, 0, arr.length - 1); // with merge sort approach
        System.out.println("total inversion : " + res);
    }

    private static int countInversion(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    count++;
            }
        }
        return count;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high)
            return count;

        int mid = (low + high) / 2;

        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);

        return count;

    }

    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        int count = 0; // Modification 1

        int left = low;

        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                count += (mid - left + 1); // Modification 2
                right++;
            }

        }

        while (left <= mid) {

            temp.add(arr[left]);
            left++;

        }

        while (right <= high) {

            temp.add(arr[right]);

            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

        return count; // Modification 3
    }

}
