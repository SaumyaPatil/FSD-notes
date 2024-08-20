package Trees;

public class BinaryTree {

    static void preOrder(Node root){
        if (root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root){
        if (root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    static void inOrder(Node root){
        if (root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {

        //Q1. Write a program, take input from user and search the element. - apply traversal method and find the element
        //Q2. Write a program, to find sum of all elements in a binary tree.
        //Q3. Write a program, to find largest element in a binary tree.

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.right = new Node(40);
        root.left.left = new Node(50);
        root.right.left = new Node(60);
        System.out.print("Preorder traversal: ");
        preOrder(root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        postOrder(root);
        System.out.println();

        System.out.print("Inorder traversal: ");
        inOrder(root);
    }
}
