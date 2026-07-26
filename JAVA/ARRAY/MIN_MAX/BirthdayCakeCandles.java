package JAVA.ARRAY.MIN_MAX;

public class BirthdayCakeCandles {

    public static void main(String[] args) {

        int[] candles = { 3, 2, 1, 3 };

        System.out.println(birthdayCakeCandles(candles));
    }

    private static int birthdayCakeCandles(int[] candles) {

        int max = candles[0];
        int count = 0;

        for (int candle : candles) {

            if (candle > max) {
                max = candle;
                count = 1;
            } else if (candle == max) {
                count++;
            }

        }

        return count;
    }

}

/*
 * Question:
 * 
 * You are in charge of the cake for a child's birthday.
 * 
 * Each candle has a height represented by an integer.
 * The child can only blow out the tallest candles.
 * 
 * Your task is to count how many candles have the maximum height.
 * 
 * Example:
 * 
 * Input:
 * 3 2 1 3
 * 
 * Candle Heights:
 * 
 * 3
 * 2
 * 1
 * 3
 * 
 * Tallest Candle Height:
 * 3
 * 
 * Number of Tallest Candles:
 * 2
 * 
 * Output:
 * 2
 * 
 * 
 * Example 2
 * 
 * Input:
 * 4 4 1 3
 * 
 * Tallest Height:
 * 4
 * 
 * Count:
 * 2
 * 
 * 
 * Logic:
 * 
 * Traverse the array once.
 * 
 * 1. Keep track of the current maximum height.
 * 2. If a larger candle is found:
 * - Update the maximum.
 * - Reset count to 1.
 * 3. If another candle has the same maximum height:
 * - Increment count.
 * 4. Return count.
 * 
 * 
 * Dry Run:
 * 
 * Input:
 * [3, 2, 1, 3]
 * 
 * Iteration 1:
 * max = 3
 * count = 1
 * 
 * Iteration 2:
 * 2 < 3
 * count = 1
 * 
 * Iteration 3:
 * 1 < 3
 * count = 1
 * 
 * Iteration 4:
 * 3 == 3
 * count = 2
 * 
 * Return:
 * 2
 * 
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 */