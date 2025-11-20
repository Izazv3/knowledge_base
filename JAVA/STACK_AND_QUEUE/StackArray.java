package JAVA.STACK_AND_QUEUE;

public class StackArray {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());

    }
}
