package Trees;

import java.awt.event.FocusAdapter;
import java.util.Queue;
import java.util.LinkedList;

class Node1{
    int data;
    Node1 left;
    Node1 right;

    Node1(int data){
        this.data = data;
        this.left=null;
        this.right=null;
    }

    static void LevelOrder(Node1 root){
        Queue<Node1> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node1 temp = q.poll();
            System.out.println(temp.data+" ");
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
    }

    static int SumOfElements(Node1 root){
        if(root==null)return 0;
        return root.data + SumOfElements(root.left) + SumOfElements(root.right);
    }

    static boolean Found(Node1 root, int key){
        if (root==null) return false;
        if (root.data==key) return true;
        return Found(root.left, key) || Found(root.right, key);
    }

    static void InsertData(int key, Node1 root){
        Queue<Node1>q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node1 temp = q.poll();
            if (temp.left == null){
                temp.left = new Node1(key);
                break;
            }else {
                q.add(temp.left);
            }

            if (temp.right == null){
                temp.right = new Node1(key);
                break;
            }else {
                q.add(temp.right);
            }
        }
    }
}

public class Inorder {
    public static void main(String[] args) {

        Node1 root = new Node1(10);
        root.left = new Node1(20);
        root.right = new Node1(30);
        root.left.right = new Node1(40);
        root.left.left = new Node1(50);
        root.right.left = new Node1(60);

    }
}
