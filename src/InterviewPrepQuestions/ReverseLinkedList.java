package InterviewPrepQuestions;

import java.util.Scanner;

public class ReverseLinkedList {

    Node head;

    ReverseLinkedList(){
        head=null;
    }

    void ReverseFromKSteps(Node root, int k){
        int c=1;
        Node counter=root;
        while (c<k){
            counter=counter.next;
            c++;
        }

        Node prev=null, curr=counter.next, nex;
        while (curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        counter.next=prev;
    }

    void insertAtTheEnd(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        Node last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=newNode;
    }

    void printData(){
        Node last=head;
        while (last!=null){
            System.out.print(last.data + " ");
            last=last.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList lj = new ReverseLinkedList();
        lj.insertAtTheEnd(1);
        lj.insertAtTheEnd(5);
        lj.insertAtTheEnd(9);
        lj.insertAtTheEnd(13);
        lj.insertAtTheEnd(16);
        lj.insertAtTheEnd(124);
        lj.insertAtTheEnd(123);
        lj.insertAtTheEnd(122);
        lj.insertAtTheEnd(121);
        lj.printData();
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();

        lj.ReverseFromKSteps(lj.head, k);
        lj.printData();
    }
}
