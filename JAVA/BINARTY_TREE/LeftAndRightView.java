package JAVA.BINARTY_TREE;

import java.util.ArrayList;

public class LeftAndRightView {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(10);
        root.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(5);
        root.left.left.right.right = new TreeNode(6);

        // right node
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(11);

        ArrayList<Integer> result = new ArrayList<>();

        leftView(root, result, 0);

        System.out.println(result.toString());

    }

    private static void leftView(TreeNode root, ArrayList<Integer> result, int level) {
        if (root == null) {
            return;
        }
        if (level == result.size()) {
            result.add(root.value);
        }
        leftView(root.left, result, level + 1);
        leftView(root.right, result, level + 1);

    }

    private static void rightView(TreeNode root, ArrayList<Integer> result, int level) {
        if (root == null) {
            return;
        }
        if (level == result.size()) {
            result.add(root.value);
        }
        rightView(root.right, result, level + 1);
        rightView(root.left, result, level + 1);

    }
}

// https://static.takeuforward.org/content/right-left-tree-image1-LK79LuMP. -->
// node image link
