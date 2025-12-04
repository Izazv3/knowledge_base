package JAVA.STACK_AND_QUEUE;

import java.util.Stack;

public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        sortStack(stack);

        System.out.println(stack);
    }

    private static void sortStack(Stack<Integer> stack) {

        System.out.println("sort >>> " + stack);

        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        sortStack(stack); // it executes deeeply so unwind happens

        insertStack(stack, top);

        printStack(stack);

    }

    private static void printStack(Stack<Integer> stack) {
        System.out.println("print >> " + stack);
    }

    private static void insertStack(Stack<Integer> stack, int element) {

        System.out.println("insert >>>> " + element);

        if (stack.isEmpty() || stack.peek() >= element) {
            stack.push(element);
            return;
        }

        int top = stack.pop();

        insertStack(stack, element);

        stack.push(top);

    }

}
