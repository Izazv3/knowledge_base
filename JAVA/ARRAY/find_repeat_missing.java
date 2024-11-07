package JAVA.ARRAY;

import java.util.Arrays;

public class find_repeat_missing {

    public static void main(String args[]) {
        int[] arr = { 3, 1, 2, 5, 2, 6, 7, 8 };

        int[] res = findRepeatMissingValue(arr);

        System.out.println(Arrays.toString(res));

    }

    private static int[] findRepeatMissingValue(int[] arr) {
        int repeated = -1;
        int missed = -1;

        for (int i = 1; i <= arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i)
                    count++;
            }

            if (count == 2)
                repeated = i;
            else if (count == 0)
                missed = i;

            if (repeated != -1 && missed != -1) {
                break;
            }
        }

        int[] ans = { repeated, missed };
        return ans;
    }

}
