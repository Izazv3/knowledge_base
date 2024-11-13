package JAVA.ARRAY;

public class majority_element {
    public static void main(String args[]) {
        int[] arr = { 4, 4, 2, 4, 3, 4, 4, 3, 2, 4 };
        int res = majorityElement(arr);
        System.out.println("majority element found is : " + res);
    }

    // time complexitites >> O(n^2)
    private static int majorityElement(int[] arr) {
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
}
