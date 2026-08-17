package JAVA.ARRAY;

public class RemoveVowels {

    public static void main(String[] args) {
        String s = "beautiful";

        removeVowels(s);

    }

    private static void removeVowels(String s) {
        StringBuilder builder = new StringBuilder();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (isVowel(arr[i])) {
                builder.append("*");
            } else {
                builder.append(arr[i]);
            }

        }

        System.out.println(builder.toString());

    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
