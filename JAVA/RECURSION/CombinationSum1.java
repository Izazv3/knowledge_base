package JAVA.RECURSION;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        int target = 7;

        List<List<Integer>> answer = combinationSum(arr, target);
        System.out.println(answer);
    }

    private static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();

        backTrack(arr, target, new ArrayList<>(), 0, result);

        return result;

    }

    private static void backTrack(int[] arr, int target, List<Integer> current, int index, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < arr.length; i++) {

            current.add(arr[i]);

            backTrack(arr, target - arr[i], current, i, result);
            current.remove(current.size() - 1);

        }
    }
}
