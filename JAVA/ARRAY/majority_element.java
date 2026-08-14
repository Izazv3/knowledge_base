package JAVA.ARRAY;

public class majority_element {
    public static void main(String[] args) {

        int[] arr = { 11, 33, 33, 11, 33, 11 };
        int res = majorityElement2(arr);
        System.out.println("majority element found is : " + res);
    }

    // time complexitites >> O(n^2)
    // N/2 -> majority element twice
    private static int majorityElement1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;

            }

            if (count > (arr.length / 2)) {
                return arr[i];
            }
        }
        return -1;
    }

    // N/3 -> majority element tree times
    private static int majorityElement2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;

            }

            if (count > (arr.length / 3)) {
                return arr[i];
            }
        }
        return -1;
    }
}
