package JAVA.ARRAY;

public class count_inversion {

    public static void main(String args[]) {
        int[] arr = { 5, 3, 2, 1, 4 };
        int res = countInversion(arr);
        System.out.println("total inversion : " + res);
    }

    private static int countInversion(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    count++;
            }
        }
        return count;
    }

}
