package JAVA.ARRAY;

import java.util.HashSet;

public class find_duplicate {
    public static void main(String args[]) {
        int[] arr = { 2, 5, 4, 1, 3, 2 };
        int res = findDuplicate(arr);
        System.out.println("the duplicate is " + res);
    }

    private static int findDuplicate(int[] arr) {

        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (h.contains(arr[i])) {
                return arr[i];
            }
            h.add(arr[i]);

            System.out.println(h);
        }

        return 0;
    }
}
