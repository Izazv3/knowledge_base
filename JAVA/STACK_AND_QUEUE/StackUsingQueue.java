package JAVA.STACK_AND_QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    private Queue<Integer> q;

    public StackUsingQueue() {
        q = new LinkedList<>();

    }

    public void push(int x) {

        q.offer(x);

        int size = q.size();

        // rotate elements so that the newly added element comes to front (stack
        // behaviour)
        for (int i = 0; i < size - 1; i++) {

            q.offer(q.poll());

        }

    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        return q.poll();
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }

        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }
}
