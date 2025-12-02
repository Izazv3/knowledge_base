package JAVA.STACK_AND_QUEUE;

import java.util.Stack;

public class QueueWithTwoStack {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public QueueWithTwoStack() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {

        stackIn.push(x);
    }

    public int pop() {
        shiftStack();

        return stackOut.pop();
    }

    public int peek() {

        shiftStack();
        return stackOut.peek();
    }

    public boolean isEmpty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    public void shiftStack() {

        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {

                stackOut.push(stackIn.pop());

            }
        }
    }

}
