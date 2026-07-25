package JAVA.ARRAY;

public class MatrixDiagonal {

    public static void main(String[] args) {
        int[][] matrix = {
                { 11, 2, 4 },
                { 4, 5, 6 },
                { 10, 8, -12 } };

        int answer = diagonalDifference(matrix);

        System.out.println("Diagonal Difference = " + answer);
    }

    private static int diagonalDifference(int[][] matrix) {
        int primary = 0;
        int secondary = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            primary += matrix[i][i];
            secondary += matrix[i][n - 1 - i];
        }

        return Math.abs(primary - secondary);
    }
}

// For a square matrix:

// Primary diagonal: (0,0), (1,1), (2,2) → arr[i][i]
// Secondary diagonal: (0,n-1), (1,n-2), (2,n-3) → arr[i][n-1-i]