package JAVA.BINARTY_TREE;

import java.util.*;

public class InorderTraversal {

    public static void main(String[] args) {
        // Construct the tree:
        // 1
        // / ---- \
        // 2 --- 3
        // / \
        // 4 5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

        List<Integer> result = new ArrayList<>();

        // inorder(root, result);
        // preorder(root, result);
        postorder(root, result);

        System.out.println("travered inorder list >>> " + result.toString());

    }

    private static void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inorder(root.left, result);
        result.add(root.value);
        inorder(root.right, result);
    }

    private static void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.value);

        preorder(root.left, result);
        preorder(root.right, result);
    }

    private static void postorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.value);

    }

}
