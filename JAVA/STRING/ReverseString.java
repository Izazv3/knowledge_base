package JAVA.STRING;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {

        // string is immutable use string builder or return a value
        String words = "My name is izaz";

        // String res = reverseString1(words);
        String res = reverseString2(words);

        System.out.println(res);
    }

    private static String reverseString1(String words) {

        String[] wordList = words.split(" ");

        List<String> outputLIst = new ArrayList<>();

        for (int i = wordList.length - 1; i >= 0; i--) {

            outputLIst.add(wordList[i]);

        }

        words = String.join(" ", outputLIst);

        return words;

    }

    // using two pointer

    private static String reverseString2(String words) {

        String[] wordsList = words.split(" ");

        int left = 0;
        int right = wordsList.length - 1;

        System.out.println("right >>> " + right);

        while (left < right) {

            String temp = wordsList[left];

            wordsList[left] = wordsList[right];
            wordsList[right] = temp;

            left++;
            right--;

        }

        return String.join(" ", wordsList);
    }

    private static int reverseNumber(int n) {
        int result = 0;

        while (n > 0) {

            result = result * 10 + n % 10;

            n /= 10;

        }

        return result;
    }

    private static int countNumber(int n) {
        int count = 0;

        while (n > 0) {

            n /= 10;
            count++;

        }

        return count;
    }

    private static boolean isPalindrome(int n) {

        int original = n;

        int reversed = 0;
        while (n > 0) {

            reversed = reversed * 10 + n % 10;

            n /= 10;

        }

        System.out.println("n is " + n);

        if (reversed == original) {
            return true;
        }
        return false;
    }

    private static int findGCD(int n1, int n2) {

        while (n2 > 0) {

            int temp = n2;

            n2 = n1 % n2;

            n1 = temp;

        }

        return n1;

    }

}
