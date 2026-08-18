package JAVA.STACK_AND_QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class FindNthNumber {
    public static void main(String[] args) {

        int n = 6;

        System.out.println(nthNumber(n));
    }

    private static String nthNumber(int n) {

        Queue<String> queue = new LinkedList<>();

        queue.add("3");
        queue.add("4");

        int count = 0;

        while (!queue.isEmpty()) {

            String current = queue.poll();

            count++;

            if (count == n) {
                return current;
            }

            queue.add(current + "3");
            queue.add(current + "4");

        }

        return "";

    }

}
