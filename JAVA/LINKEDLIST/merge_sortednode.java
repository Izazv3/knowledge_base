package JAVA.LINKEDLIST;

import java.util.ArrayList;
import java.util.Collections;

public class merge_sortednode {

    public static void main(String args[]) {

        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(8);

        printLinkedList(head1);
        printLinkedList(head2);

        System.out.println("merged nodes ");
        printLinkedList(mergeNode(head1, head2));
    }

    private static Node mergeNodes(Node h1, Node h2) {
        Node dummy = new Node(-1);

        Node tail = dummy;

        while (h1 != null && h2 != null) {

            if (h1.data < h2.data) {
                tail.next = h1;

                h1 = h1.next;
            } else {
                tail.next = h2;
                h2 = h2.next;
            }
            tail = tail.next;

        }

        if (h1 != null)
            tail.next = h1;
        if (h2 != null)
            tail.next = h2;

        return dummy.next;
    }

    private static Node mergeNode(Node head1, Node head2) {

        ArrayList<Integer> array = new ArrayList<>();

        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null) {
            array.add(temp1.data);
            temp1 = temp1.next;

        }

        while (temp2 != null) {
            array.add(temp2.data);
            temp2 = temp2.next;

        }

        Collections.sort(array);

        Node mergedNode = convertArrayTOLinkedList(array);

        return mergedNode;
    }

    private static Node convertArrayTOLinkedList(ArrayList<Integer> array) {
        Node head = new Node(-1); // dummy head node

        Node temp = head;

        for (int i = 0; i < array.size(); i++) {

            temp.next = new Node(array.get(i));
            temp = temp.next;
        }

        return head.next;
    }

    private static void printLinkedList(Node head1) {
        Node temp = head1;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        System.out.println();
    }

}
