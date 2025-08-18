
import java.util.Arrays;

public class TestRun {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 5, 4, 6, 7, 8 };

        int[] res = findRepeatAndMissingNumber(arr);

        // int res = countInversion(arr);

        System.out.println("duplicate number is  >>> " + Arrays.toString(res));

    }

    private static int[] findRepeatAndMissingNumber(int[] arr) {
        int repeated = -1;

        int missed = -1;

        for (int i = 1; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }

            if (count == 2) {
                repeated = i;
            } else if (count == 0) {
                missed = i;
            }

        }

        int[] result = { repeated, missed };
        return result;
    }

}