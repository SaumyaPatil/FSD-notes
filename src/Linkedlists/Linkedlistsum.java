package Linkedlists;

import java.util.Stack;

public class Linkedlistsum {
    //Q3. Find sum of all elements in a linked list

    LinkedNode head;
    Linkedlistsum(){
        head = null;
    }
    void insertAtEnd(int data){
        LinkedNode newNode = new LinkedNode(data);
        if(head==null){
            head = newNode;
            return;
        }
        LinkedNode last = head;
        while(last.next!=null){
            last = last.next;
        }
    }
    public int sumElements() {
        int sum = 0;
        LinkedNode current = head;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        return sum;
    }

    public static void main(String[] args){
        Linkedlistsum lj = new Linkedlistsum();
        lj.insertAtEnd(10);
        lj.insertAtEnd(20);
        lj.insertAtEnd(30);
        lj.insertAtEnd(40);
        System.out.println("sum of all elements in Linked List is:" + lj.sumElements());

    }
}
