package JAVA.STACK_AND_QUEUE;

public class QueueArray {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);
        queue.push(60);

        System.out.println(queue.isFull());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
    }

}
