package JAVA.STACK_AND_QUEUE;

public class MyQueue {

    private int[] arr;

    private int front;

    private int rear;

    private int size;

    private int capacity;

    public MyQueue(int capacity) {

        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;

    }

    public void push(int x) {

        if (isFull()) {

            System.out.println("queue is full");
            return;

        }

        rear = (rear + 1) % capacity;

        arr[rear] = x;

        size++;
    }

    public int pop() {

        if (isEmpty()) {

            System.out.println("queue is empty");
            return -1;

        }

        int result = arr[front];

        front = (front + 1) % capacity;

        size--;
        return result;

    }

    public int peek() {

        if (isEmpty()) {

            System.out.println("queue is empty");
            return -1;

        }

        return arr[front];

    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
