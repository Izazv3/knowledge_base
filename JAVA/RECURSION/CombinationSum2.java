package JAVA.RECURSION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;

        List<List<Integer>> result = combinationSum2(arr, target);

        for (var r : result) {
            System.out.println(r);
        }
    }

    private static List<List<Integer>> combinationSum2(int[] arr, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);

        backTrack(arr, target, new ArrayList<>(), 0, result);

        return result;

    }

    private static void backTrack(int[] arr, int target, List<Integer> current, int index,
            List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            System.out.println("array index " + arr[i] + " target " + target);

            if (i > index && arr[i] == arr[i - 1]) {
                System.out.println("loop continued");
                continue;
            }

            // Optimization: if current element is greater than target, no need to proceed
            if (arr[i] > target) {
                System.out.println("loop breaks");

                break;
            }

            current.add(arr[i]);

            backTrack(arr, target - arr[i], current, i + 1, result);

            current.remove(current.size() - 1);

        }

    }
}
