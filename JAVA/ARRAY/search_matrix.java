package JAVA.ARRAY;

public class search_matrix {

    public static void main(String args[]) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };

        int target = 10;

        boolean hasTarget = searchMatrix(matrix, target);
        System.out.println("has target >>>> " + hasTarget);

    }

    private static boolean searchMatrix(int[][] matrix, int target) {

        for (int[] row : matrix) {
            for (int element : row) {
                if (element == target) {
                    System.out.println(element);
                    return true;

                }
            }
        }

        return false;

    }

}
