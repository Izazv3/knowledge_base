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

        System.out.println("%%%%%%%%%%%%%%%%%%%");

        QueueWithTwoStack q = new QueueWithTwoStack();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q.pop()); // 10
        System.out.println(q.peek()); // 20

        q.push(40);
        System.out.println(q.pop()); // 20
        System.out.println(q.pop()); // 30

        System.out.println(q.isEmpty()); // false

        System.out.println(q.pop()); // 40
        System.out.println(q.isEmpty()); // true
    }

}
