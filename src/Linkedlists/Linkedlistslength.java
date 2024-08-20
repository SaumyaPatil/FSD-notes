package Linkedlists;

public class Linkedlistslength{
    //Q1. Write a program to count length of linked list

    LinkedNode head;
    Linkedlistslength(){
        head= null;
    }
    void  insertAtEnd(int data) {
        LinkedNode newNode = new LinkedNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        LinkedNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
    public  int countLength(){
        int count = 0;
        LinkedNode currentNode = head;

        while(currentNode != null){
            count++;
            currentNode = currentNode.next;

        }
        return count;
    }
    public static void main(String[] args){
        Linkedlistslength list = new Linkedlistslength();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        System.out.println("length of the linked list is:" + list.countLength());
        list.countLength();
    }
}