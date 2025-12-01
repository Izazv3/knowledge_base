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

                    // result.add(current.value); --> for pre order

                    current = current.left;

                } else {
                    prev.right = null;
                    result.add(current.value);

                    current = current.right;
                }

            }

        }
    }

}
