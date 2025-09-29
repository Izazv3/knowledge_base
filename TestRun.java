import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRun {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 7 };
        int target = 7;

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
        System.out.println("backtrack called >> " + target);

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // if (target < 0) {
        // return;
        // }

        for (int i = index; i < arr.length; i++) {

            if (index < i && arr[i] == arr[i - 1]) {
                System.out.println("loop continue");

                continue;
            }

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
