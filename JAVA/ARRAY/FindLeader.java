package JAVA.ARRAY;

public class FindLeader {

    public static void main(String[] args) {
        int[] arr = { 10, 22, 5, 12, 0, 3, 6 };

        findLeader(arr);
    }

    private static void findLeader(int[] arr) {

        int n = arr.length;

        int maxRight = arr[n - 1];

        System.out.println("Leader is " + maxRight);
        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] > maxRight) {
                System.out.println("Leader is " + arr[i]);

                maxRight = arr[i];
            }

        }
    }

}
