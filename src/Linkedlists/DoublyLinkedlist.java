package Linkedlists;

class Node{
    int data;
    Node pre, next;
    Node(int data){
        this.data = data;
        this.pre = null;
        this.next = null;
    }
}

public class DoublyLinkedlist {

    Node head;
    Node tail;

    public DoublyLinkedlist(){
        this.head = null;
        this.tail = null;
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }else {
            newNode.next = head;
            head.pre = newNode;
            head = newNode;
        }
    }

    public static void main(String[] args) {

    }
}
