package JAVA.BINARTY_TREE;

import java.util.*;

public class MorrisInorderTraversal {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

        // printTree(root);

        List<Integer> result = new ArrayList<>();

        inorder(root, result);

        System.out.println("travered inorder list without recursion >>> " + result.toString());

    }

    private static void inorder(TreeNode root, List<Integer> result) {

        TreeNode current = root;

        while (current != null) {

            System.out.println(current.value);

            if (current.left == null) {
                result.add(current.value);
                current = current.right;
            } else {

                TreeNode prev = current.left;

                while (prev.right != null && prev.right != current) {

                    prev = prev.right;

                }

                if (prev.right == null) {

                    prev.right = current;

                    result.add(current.value);

                    current = current.left;

                } else {
                    prev.right = null;

                    current = current.right;
                }

            }

        }
    }

    static void printTree(TreeNode root) {
        int height = getHeight(root);
        int width = (int) Math.pow(2, height) - 1;
        String[][] res = new String[height][width];

        // Fill with spaces
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                res[i][j] = " ";
            }
        }

        fill(res, root, 0, 0, width - 1);

        // Print result
        for (String[] row : res) {
            for (String val : row) {
                System.out.print(val);
            }
            System.out.println();
        }
    }

    static void fill(String[][] res, TreeNode root, int level, int left, int right) {
        if (root == null || left > right)
            return;

        int mid = (left + right) / 2;
        res[level][mid] = String.valueOf(root.value);
        fill(res, root.left, level + 1, left, mid - 1);
        fill(res, root.right, level + 1, mid + 1, right);
    }

    static int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

}

class TreeNode {
    int value;

    TreeNode left, right;

    TreeNode(int val) {
        this.value = val;

        left = right = null;
    }

}