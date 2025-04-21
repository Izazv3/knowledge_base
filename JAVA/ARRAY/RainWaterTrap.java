package JAVA.ARRAY;

public class RainWaterTrap {

    public static void main(String[] args) {
        int[] heights = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int result = trap(heights);

        System.out.println("max water tapped unit is : " + result);
    }

    // TWO pointer approach
    private static int trap(int[] heights) {
        int n = heights.length;
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;

        while (left <= right) {

            // System.out.println("left : " + left + ", right : " + right);
            System.out.println("left arr : " + heights[left] + ", right arr: " + heights[right]);

            if (heights[left] <= heights[right]) {
                if (heights[left] >= leftMax) {
                    leftMax = heights[left];

                    System.out.println("leftmax : " + leftMax);
                } else {
                    trappedWater += leftMax - heights[left];

                    System.out.println("trapped water of left >>> " + trappedWater);
                }

                left++;
            } else {

                if (heights[right] >= rightMax) {
                    rightMax = heights[right];

                    System.out.println("rightmax : " + rightMax);

                } else {
                    trappedWater += rightMax - heights[right];

                    System.out.println("trapped water of right  >>> " + trappedWater);

                }

                right--;
            }

        }

        return trappedWater;
    }

}
