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

        StackUsingQueue st = new StackUsingQueue();

        // Array of commands
        String[] commands = { "QueueStack", "push", "push",
                "pop", "top", "isEmpty" };
        int[][] inputs = { {}, { 4 }, { 8 }, {}, {}, {} };

        for (int i = 0; i < commands.length; ++i) {
            switch (commands[i]) {
                case "push":
                    st.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(st.pop() + " ");
                    break;
                case "top":
                    System.out.print(st.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print(st.isEmpty() ? "true " : "false ");
                    break;
                case "QueueStack":
                    System.out.print("null ");
                    break;
            }
        }

    }
}
