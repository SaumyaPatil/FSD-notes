package Questions;


public class MergeList {
    public void mergeLists(LinkedNode list1, LinkedNode list2) {
        LinkedNode current1 = list1;
        LinkedNode current2 = list2;

        while (current1 != null && current2 != null) {
            // Save next pointers
            LinkedNode next1 = current1.next;
            LinkedNode next2 = current2.next;

            // Insert current2 after current1
            current1.next = current2;
            current2.next = next1;

            // Move to the next nodes
            current1 = next1;
            current2 = next2;
        }

        // If list2 has remaining nodes, set list2's head to current2
        if (current2 != null) {
            list2 = current2;
        } else {
            list2 = null;
        }
    }

    public static void printList(LinkedNode head) {
        LinkedNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeList solution = new MergeList();

        // Create first list: 5->7->17->13->11
        LinkedNode list1 = new LinkedNode(5);
        list1.next = new LinkedNode(7);
        list1.next.next = new LinkedNode(17);
        list1.next.next.next = new LinkedNode(13);
        list1.next.next.next.next = new LinkedNode(11);

        // Create second list: 12->10->2->4->6
        LinkedNode list2 = new LinkedNode(12);
        list2.next = new LinkedNode(10);
        list2.next.next = new LinkedNode(2);
        list2.next.next.next = new LinkedNode(4);
        list2.next.next.next.next = new LinkedNode(6);

        System.out.println("Before merging:");
        printList(list1);
        printList(list2);

        solution.mergeLists(list1, list2);

        System.out.println("After merging:");
        printList(list1);
        printList(list2);  // Should be empty
    }
}
