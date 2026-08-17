package JAVA.ARRAY;

public class AnagramCheck {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean result = checkAnagram(s1, s2);

        System.out.println("is anagram " + result);
    }

    private static boolean checkAnagram(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        sortCharArray(arr1);
        sortCharArray(arr2);

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] != arr2[i]) {
                return false;
            }

        }

        return true;

    }

    private static void sortCharArray(char[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

            }

            if (minIndex != i) {
                char temp = arr[i];

                arr[i] = arr[minIndex];

                arr[minIndex] = temp;
            }

        }
    }

}
