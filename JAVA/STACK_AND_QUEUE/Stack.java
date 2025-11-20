package JAVA.STACK_AND_QUEUE;

public class Stack {
    int[] arr;

    int top; // index of the top element

    int capacity; // maximum number of elements stack can hold. (arr size)

    Stack(int size) {
        arr = new int[size];

        top = -1;

        capacity = size;

    }

    public void push(int x) {

        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }

        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");

            return -1;
        }

        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
