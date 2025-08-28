package JAVA.ARRAY;

import java.util.*;

public class next_permutation {

    public static void main(String args[]) {
        int[] arr = { 1, 3, 2 };
        nextPermutation2(arr);
        System.out.println("Next permutation : " + Arrays.toString(arr));
    }

    private static void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(nums, 0);
            return;

        }
        // next index which is greater than index
        for (int i = n - 1; i >= index; i--) {
            if (nums[index] < nums[i]) {
                swap(nums, index, i);
                break;

            }
        }

        reverse(nums, index + 1);

    }

    private static void reverse(int[] arr, int left) {
        int right = arr.length - 1;

        while (left < right) {

            swap(arr, left, right);

            left++;
            right--;

        }

    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];

        arr[i] = arr[j];

        arr[j] = temp;

    }

    private static void nextPermutation2(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from the end
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find element just larger than arr[i] from the end
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            // Step 3: Swap
            swap(arr, i, j);
        }

        // Step 4: Reverse the suffix
        reverse(arr, i + 1);
    }

}
