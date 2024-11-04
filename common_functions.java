class Main {
    private static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            swap(arr, left, right);

            left++;
            right--;

        }

    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];

        arr[i] = arr[j];

        arr[j] = temp;

    }

    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}