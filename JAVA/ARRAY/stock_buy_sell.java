package JAVA.ARRAY;

public class stock_buy_sell {

    public static void main(String args[]) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };

        int result = maxProfit(arr);

        System.out.println(result);
    }

    private static int maxProfit(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }

        return maxProfit;
    }
}
