package JAVA.TWO_POINTERS;

public class EfficientJanitor {

    public static void main(String[] args) {

        double[] weights = { 1.01, 1.99, 2.5, 1.5 };

        int trips = calculateTripBag(weights);

        System.out.println(trips);

    }

    private static int calculateTripBag(double[] weights) {
        int trips = 0;

        int left = 0;

        int right = weights.length - 1;

        while (left <= right) {

            if (left == right) {
                trips++;
                break;
            }

            if (weights[left] + weights[right] <= 3) {
                left++;
                right--;
            } else {
                right--;
            }
            trips++;
        }

        return trips;
    }

}

// constraints

// trips can hold upto 2 bags upto 3 pounds, each bag contains between 1.01 to
// 3.00 pounds.

// Time Complexity
// Sorting: O(n log n)
// Two pointers: O(n)

// Overall: O(n log n)