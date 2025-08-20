package JAVA.ARRAY;

// kadane algorithm
public class maximum_subarray {

    // Kadane's Algorithm
    private static int maxSubarraySum(int[] arr, int n) {
        int maxSum = arr[0]; // Initialize with first element
        int currentSum = arr[0]; // Current subarray sum

        for (int i = 1; i < n; i++) {
            // Either extend the current subarray OR start a new one from arr[i]
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maxSum if we found a new best
            maxSum = Math.max(maxSum, currentSum);
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
