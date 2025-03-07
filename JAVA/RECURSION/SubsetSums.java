package JAVA.RECURSION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSums {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3 };

        List<Integer> result = getSubsetSums(arr);

        System.out.println(result);
    }

    private static List<Integer> getSubsetSums(int[] arr) {
        List<Integer> result = new ArrayList<>();
        subsetSums(arr, 0, 0, result);
        Collections.sort(result);
        return result;
    }

    private static void subsetSums(int[] arr, int index, int currentSum, List<Integer> result) {

        if (index == arr.length) {

            result.add(currentSum);
            return;
        }

        subsetSums(arr, index + 1, currentSum + arr[index], result);
        subsetSums(arr, index + 1, currentSum, result);
    }

}

// subset = parts inside array in misorder

// subarray = parts of array in order

// subsequence = part of array with missing elements
