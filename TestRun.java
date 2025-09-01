
public class TestRun {
    public static void main(String args[]) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printMatrix(arr);
        rotate(arr);
        printMatrix(arr);
    }

    private static void rotate(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {

                swap(arr, i, j, j, i);

            }

        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n / 2; j++) {

                swap(arr, i, j, i, n - 1 - j);

            }

        }

    }

    private static void swap(int[][] arr, int i1, int j1, int i2, int j2) {
        int temp = arr[i1][j1];
        arr[i1][j1] = arr[i2][j2];
        arr[i2][j2] = temp;
    }

    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("############################");

    }

}