import java.util.ArrayList;

import JAVA.BINARTY_TREE.TreeNode;

public class TestRun {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

        ArrayList<Integer> result = new ArrayList<>();

        inorder(root, result);

        System.out.println(result.toString());

    }

    private static void inorder(TreeNode root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }

        System.out.println("inorder entry");

        inorder(root.left, result);
        result.add(root.value);
        System.out.println("result added");
        inorder(root.right, result);

        System.out.println("inorder exit");

    }

}