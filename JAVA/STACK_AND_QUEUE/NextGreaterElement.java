package JAVA.STACK_AND_QUEUE;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };

        int[] result = nextGreaterElement(arr);

        System.out.println(Arrays.toString(result));

    }

    // monotonic stack

    private static int[] nextGreaterElement(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        int n = arr.length;

        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) { // reverse order to keep track right elements

            while (!stack.isEmpty() && stack.peek() <= arr[i]) { // if >= it finds next smallest element
                stack.pop();
            }

            if (stack.isEmpty()) {

                result[i] = -1;

            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return result;

    }

    // normal approach brute force

    private static int[] nextGreaterElement2(int[] arr) {

        int n = arr.length;

        int[] result = new int[n];

        for (int i = 0; i < arr.length; i++) {

            result[i] = -1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }

            }

        }

        return result;
    }

}
