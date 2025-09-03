import java.util.ArrayList;
import java.util.Arrays;

public class TestRun {

    public static void main(String args[]) {

        Node head1 = new Node(1);

        head1.next = new Node(5);
        head1.next.next = new Node(8);
        head1.next.next.next = new Node(7);
        head1.next.next.next.next = new Node(2);
        head1.next.next.next.next.next = new Node(0);
        head1.next.next.next.next.next.next = new Node(3);

        printNode(head1);
        Node res = reverseNode(head1);
        printNode(res);

    }

    private static Node reverseNode(Node head1) {
        if (head1 == null || head1.next == null) {
            return head1;
        }

        Node newHead = reverseNode(head1.next);

        head1.next.next = head1;

        head1.next = null;

        return newHead;
    }

    private static void printNode(Node head1) {
        Node temp = head1;

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println("");

    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}