package Linkedlists;

public class LinkedlistStart {
    //Insert nodes in the start
    LinkedNode head;
    LinkedlistStart(){
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

    void insertAtAnyPoint(LinkedNode pre, int data){
        //This is in constant time since we have address of pre.
        if(pre.next == null)return;      //This is used to insert node in between.
        LinkedNode newNode = new LinkedNode(data);
        newNode.next = pre.next;
        pre.next = newNode;
    }

    int Len(LinkedNode list){
        int count=0;
        while(list!=null){
            count++;
            list=list.next;
        }
        return count;
    }

    int Sum(LinkedNode list){
        int sum=0;
        while(list!=null){
            sum = sum + list.data;
            list=list.next;
        }
        return sum;
    }

    void printData(){
        LinkedNode last=head;
        while (last!=null){
            System.out.println(last.data);
            last=last.next;
        }
    }

    public static void main(String[] args) {
        LinkedlistStart obj=new LinkedlistStart();
        obj.insertInBeg(10);
        obj.insertInBeg(20);
        obj.insertInBeg(30);
        obj.insertInBeg(40);
        
        LinkedNode nodeAdr = obj.head.next;
        obj.insertAtAnyPoint(nodeAdr, 25);
        obj.printData();

        int length = obj.Len(obj.head);
        System.out.println("The length of linked list is: " + length);

        int sum = obj.Sum(obj.head);
        System.out.println("The sum of linked list is: " + sum);
    }
}
