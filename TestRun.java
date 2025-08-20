
public class TestRun {

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int maxSum = maxSubarraySum(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);

    }

    private static int maxSubarraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);

        }

        return maxSum;
    }

    \
}