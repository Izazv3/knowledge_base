package JAVA.ARRAY;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };

        int target = 14;

        int[] result = twoSum(arr, target);

        if (result != null) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }

    private static int[] twoSum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int need = target - arr[i];

            if (map.containsKey(need)) {

                return new int[] { map.get(need), i };

            }
            map.put(arr[i], i);

        }

        return new int[] { -1, -1 };

    }

}
