package Trees;

public class IdenticalTrees {

    static boolean isIdentical(Node root1, Node root2){
        if (root1==null && root2==null)return true;
        if (root1.data!=root2.data)return false;
        if (root1==null || root2==null)return false;
        return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        Node root1 = new Node(26);
        root1.left = new Node(10);
        root1.left.right = new Node(6);
        root1.right = new Node(4);
        root1.right.left = new Node(3);

        Node root2 = new Node(26);
        root2.left = new Node(10);
        root2.left.right = new Node(6);
        root2.right = new Node(4);
        root2.right.left = new Node(3);
        System.out.println(isIdentical(root1, root2));
    }
}
