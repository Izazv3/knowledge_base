package JAVA.RECURSION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueSubsets {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        List<List<Integer>> result = getUniqueSubsets(arr);

        System.out.println(result);

    }

    private static List<List<Integer>> getUniqueSubsets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        findSubset(arr, 0, new ArrayList<>(), result);

        return result;
    }

    private static void findSubset(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for (int i = index; i < arr.length; i++) {

            if (i > index && arr[i] == arr[i - 1]) {
                continue; // skip duplicate
            }

            current.add(arr[i]);
            findSubset(arr, i + 1, current, result);
            current.remove(current.size() - 1); // backtrack

        }

    }

}
