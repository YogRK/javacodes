import java.util.*;

public class createLinkedList {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    public static void printLL(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.err.println("null");
    }

    public static void main(String[] args) {
        // creation of oned
        Node a = new createLinkedList().new Node(5);
        Node b = new createLinkedList().new Node(6);
        Node c = new createLinkedList().new Node(7);
        a.next = b;
        b.next = c;
        // Always use a varible to print the linked list bcz first node is head and we
        // dont' have to lost bcz only head is given to us.
        // Node current = a;
        // // Printing of Linked list
        // while (current != null) { // current.next ees lye nahi terminating condition hogi kyoki last wala node
        //                           // print nahi hoga
        //     System.out.print(current.val + "->");
        //     current = current.next;
        printLL(a);
        
    }

}
