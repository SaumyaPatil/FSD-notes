package Linkedlists;

public class Loops {

    LinkedNode head;

    Loops(){
        head=null;
    }

    void insertAtTheEnd(int data){
        LinkedNode newNode=new LinkedNode(data);
        if (head==null){
            head=newNode;
            return;
        }
        LinkedNode last=head;
        while (last.next!=null){
            last=last.next;
        }
        last.next=newNode;
    }

    void deleteAtHead(){
        if (head==null)return;
        head=head.next;
    }

    void printData(){
        LinkedNode last=head;
        while (last!=null){
            System.out.println(last.data);
            last=last.next;
        }
    }

    public static void main(String[] args) {
        //This is code to insert node at the end.
        Linkedlists lj = new Linkedlists();
        lj.insertAtTheEnd(10);
        lj.insertAtTheEnd(20);
        lj.insertAtTheEnd(30);
        lj.insertAtTheEnd(40);
        lj.printData();

        //Deletion of node
//        lj.deleteAtHead();
    }
}
