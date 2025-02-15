package JAVA.RECURSION;

public class StringPermutation {

    public static void main(String[] args) {
        String inpString = "ABC";

        permute(inpString.toCharArray(), 0);
    }

    private static void permute(char[] charArray, int index) {
        if (index == charArray.length) {
            System.out.println(charArray);
            return;

        }

        for (int i = index; i < charArray.length; i++) {
            swap(charArray, i, index);
            permute(charArray, index + 1);
            swap(charArray, i, index);
        }
    }

    private static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

}
