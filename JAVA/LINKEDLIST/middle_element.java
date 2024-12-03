package JAVA.LINKEDLIST;

class middle_element {
    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node midNode = findMidNode2(head);

        System.out.println("middle element is " + midNode.data);

    }

    private static Node findMidNode(Node head) {

        Node temp = head;

        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;

        }

        System.out.println("count " + count);

        temp = head;

        int mid = count / 2 + 1;

        while (temp != null) {

            mid = mid - 1;

            if (mid == 0)
                break;

            temp = temp.next;

        }

        return temp;

    }

    // hare and tortoise method O(N)
    public static Node findMidNode2(Node head) {

        Node slow = head;

        Node fast = head;

        while (fast != null && fast.next != null && slow != null) {

            fast = fast.next.next;
            slow = slow.next;

        }

        return slow;

    }

}
