package Linkedlists;

public class FindMidOfLinkedList {

    LinkedNode head;
    FindMidOfLinkedList(){
        head = null;
    }
    void  insertInBeg(int data) {
        LinkedNode newNode = new LinkedNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    LinkedNode first=head, second=head;

    //Why shouldn't we give global pointers
    int findMid(){
        while(first!=null && second!=null && second.next!=null){
            second=second.next.next;
            first=first.next;
        }
        return first.data;
    }

    void printData(){
        LinkedNode last=head;
        while (last!=null){
            System.out.println(last.data);
            last=last.next;
        }
    }

    public static void main(String[] args) {
        FindMidOfLinkedList obj = new FindMidOfLinkedList();
        obj.insertInBeg(10);
        obj.insertInBeg(20);
        obj.insertInBeg(30);
        obj.insertInBeg(40);
        obj.printData();
        System.out.println(obj.findMid());
    }
}
