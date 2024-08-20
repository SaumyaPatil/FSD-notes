package Trees;

import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

class Q1 {
    TreeNode root;

    TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    boolean search(TreeNode root, int val) {
        if (root == null) {
            return false;
        }

        if (root.val == val) {
            return true;
        }

        if (val < root.val) {
            return search(root.left, val);
        }

        return search(root.right, val);
    }

    public static void main(String[] args) {
        Q1 tree = new Q1();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements to insert in the binary tree:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            tree.root = tree.insert(tree.root, element);
        }

        System.out.println("Enter the element to search:");
        int searchElement = scanner.nextInt();

        if (tree.search(tree.root, searchElement)) {
            System.out.println(searchElement + " is present in the binary tree.");
        } else {
            System.out.println(searchElement + " is not present in the binary tree.");
        }

        scanner.close();
    }
}
