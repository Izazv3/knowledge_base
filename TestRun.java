import java.util.ArrayList;
import java.util.Arrays;

public class TestRun {
    public static void main(String[] args) {
        int[] heights = { 2, 4, 1, 2, 3, 2, 2, 1 };
        int result = trap(heights);

        System.out.println("max water tapped unit is : " + result);
    }

    private static int trap(int[] heights) {
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {

            if (heights[left] < heights[right]) {
                if (leftMax <= heights[left]) {
                    leftMax = heights[left];
                } else {
                    water += leftMax - heights[left];
                }
                left++;
            } else {
                if (rightMax <= heights[right]) {
                    rightMax = heights[right];
                } else {
                    water += rightMax - heights[right];
                }
                right--;
            }

        }

        return water;

    }

}