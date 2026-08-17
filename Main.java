import java.util.Arrays;

public class Main {

    // public static void main(String[] args) {
    // String text = "xyzabxyzabxyz";
    // String pattern = "xyz";

    // findPatternIndexes2(text, pattern);
    // }

    // private static void findPatternIndexes2(String text, String pattern) {

    // }

    public static void main(String args[]) {
        int[] arr = { 3, 1, 2, 5, 2, 6, 7, 8 };

        int[] res = findRepeatMissingValue(arr);

        System.out.println(Arrays.toString(res));

    }

    private static int[] findRepeatMissingValue(int[] arr) {

        int missing = -1;
        int repeated = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == i) {
                    count++;
                }

            }

            if (count == 2) {
                repeated = i;
            } else if (count == 0) {
                missing = i;
            }

        }

        return new int[] { missing, repeated };
    }

}
