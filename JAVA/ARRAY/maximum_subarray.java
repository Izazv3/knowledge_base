package JAVA.ARRAY;

public class maximum_subarray {

    public static int maxSubarraySum(int[] arr, int n) {

        int currenSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currenSum = Math.max(arr[i], currenSum + arr[i]);
            maxSum = Math.max(maxSum, currenSum);

        }

        return maxSum;

    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

}
