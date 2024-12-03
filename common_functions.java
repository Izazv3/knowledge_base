import JAVA.LINKEDLIST.Node;

class CommonFunctions {
    public static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            swap(arr, left, right);

            left++;
            right--;

        }

    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];

        arr[i] = arr[j];

        arr[j] = temp;

    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("**********************");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("**********************");

    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}