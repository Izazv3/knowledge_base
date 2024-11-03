package JAVA.ARRAY;

import java.util.*;

public class next_permutation {

    public static void main(String args[]) {
        int[] arr = { 1, 3, 2 };
        nextPermutation(arr);
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

}
