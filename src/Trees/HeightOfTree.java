package Trees;

public class HeightOfTree {
    //Find height of tree.
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(12);
        root.left.left = new Node(13);
        root.left.left.left = new Node(15);
        root.left.left.left.right = new Node(16);
        root.left.left.left.left = new Node(1);
        root.left.left.right = new Node(14);
    }
}
