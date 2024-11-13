package JAVA.ARRAY;

public class search_matrix {

    public static void main(String args[]) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };

        int target = 5;

        boolean hasTarget = binarySearchMatrix(matrix, target);
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

    public static boolean binarySearchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            if (binarySearch(matrix[i], target)) {
                return true;
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        System.out.println("low : " + low + " - high : " + high);

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("mid : " + mid);
            if (arr[mid] == target)
                return true;
            else if (arr[mid] < target)
                low = mid + 1;
            else if (arr[mid] > target)
                high = mid - 1;
        }
        return false;
    }

}
