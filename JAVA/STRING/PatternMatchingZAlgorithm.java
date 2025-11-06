package JAVA.STRING;

import java.util.Arrays;

public class PatternMatchingZAlgorithm {

    public static void main(String[] args) {
        String text = "xyzabxyzabxyz";
        String pattern = "xyz";

        findPatternIndexes(text, pattern);
    }

    private static void findPatternIndexes(String text, String pattern) {
        String combined = pattern + "$" + text;

        System.out.println("combined >>>" + combined);
        int[] Z = calculateZArray(combined);

        System.out.println("z array >>> " + Arrays.toString(Z));

        int patternLength = pattern.length();

        for (int i = 0; i < Z.length; i++) {
            if (Z[i] == patternLength) {
                // Adjust index to original text
                int index = i - patternLength - 1;

                System.out.print(index + " ");
            }
        }
    }

    private static int[] calculateZArray(String str) {
        int n = str.length();
        int[] Z = new int[n];
        int left = 0, right = 0;

        for (int i = 1; i < n; i++) {
            if (i <= right) {
                Z[i] = Math.min(right - i + 1, Z[i - left]);
            }

            while (i + Z[i] < n && str.charAt(Z[i]) == str.charAt(i + Z[i])) {
                Z[i]++;
            }

            if (i + Z[i] - 1 > right) {
                left = i;
                right = i + Z[i] - 1;
            }
        }

        return Z;
    }

    // sub string method
    private static void findPatternIndexes2(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i < n; i++) {

            String sub = text.substring(i, i + m);

            System.out.println("Sub >>>> " + sub);

            if (sub.equals(pattern)) {
                System.out.print(i + " ");
            }

        }

    }

}
