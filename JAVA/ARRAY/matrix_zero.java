package JAVA.ARRAY;

public class matrix_zero {

    public static void main(String args[]) {
        int[][] matrix = { { 1, 1, 1, }, { 1, 0, 1 }, { 1, 1, 1 } };

        printMatrix(matrix);

        setMatrixZero(matrix);

        printMatrix(matrix);

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

        // -1 becuase if we set zero it will affect the matrix avoid overwriting

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
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

    private static void setMatrixZeroOptimal(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean isCol = false;

        // Step 1: mark first row & col
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                isCol = true;
            }
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // mark row
                    matrix[0][j] = 0; // mark col
                }
            }
        }

        // Step 2: update cells using markers
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (isCol) {
                matrix[i][0] = 0;
            }
        }

    }

}
