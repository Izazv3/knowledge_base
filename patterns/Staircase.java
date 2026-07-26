package patterns;

public class Staircase {

    public static void main(String[] args) {
        buildRightAlignStairCase(6);
    }

    private static void buildRightAlignStairCase(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }

}

// Sample Input

// 6
// Sample Output

// #
// ##
// ###
// ####
// #####
// ######
// Explanation

// The staircase is right-aligned, composed of # symbols and spaces, and has a
// height and width of .