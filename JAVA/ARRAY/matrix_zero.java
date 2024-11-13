package JAVA.ARRAY;

public class matrix_zero {

    public static void main(String args[]) {
        int[][] matrix = { { 1, 0, 1, }, { 1, 1, 1 }, { 0, 1, 1 } };

        printMatrix(matrix);

        setMatrixZero(matrix);
    }

    private static void setMatrixZero(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, j);
                    markCol(matrix, i);
                }
            }
        }

        printMatrix(matrix);

    }

    private static void markRow(int[][] matrix, int j) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    private static void markCol(int[][] matrix, int i) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("**********************");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("**********************");

    }

}
