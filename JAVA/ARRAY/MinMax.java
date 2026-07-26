package JAVA.ARRAY;

public class MinMax {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        printMinMx(arr);
    }

    private static void printMinMx(int[] arr) {
        int total = 0;

        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            total += i;

            min = Math.min(i, min);
            max = Math.max(i, max);
        }

        long minSum = total - max;
        long maxsum = total - min;

        System.out.println(minSum + " " + maxsum);
    }

}

// Input:

// 1 2 3 4 5

// Possible sums of 4 numbers:

// Excluded Number Sum
// 1. 2 + 3 + 4 + 5 = 14 (MAX)
// 2. 1 + 3 + 4 + 5 = 13
// 3. 1 + 2 + 4 + 5 = 12
// 4. 1 + 2 + 3 + 5 = 11
// 5. 1 + 2 + 3 + 4 = 10 (MIN)

// Minimum sum:

// 10

// Maximum sum:

// 14

// Output:

// 10 14