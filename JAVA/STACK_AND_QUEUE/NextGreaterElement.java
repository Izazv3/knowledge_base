package JAVA.STACK_AND_QUEUE;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };

        int[] result = nextGreaterElement2(arr);

        System.out.println(Arrays.toString(result));

    }

    // monotonic stack

    private static int[] nextGreaterElement(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        int n = arr.length;

        int[] result = new int[n];

        Arrays.fill(result, -1);

        for (int i = 0; i < 2 * n; i++) {

            int index = i % n;

            while (!stack.isEmpty() && arr[index] > arr[stack.peek()]) {

                result[stack.pop()] = arr[index];

            }

            if (i < n) {

                stack.push(index);
            }

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
