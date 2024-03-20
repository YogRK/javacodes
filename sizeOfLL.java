import java.util.*;

public class sizeOfLL {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static int countNumberOfNode(Node head){
        int count=0;
        Node current = head;
        while(current != null){
            count++;
           current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        // write calss node name or file name
        Node a = new sizeOfLL().new Node(5);
        Node b = new sizeOfLL().new Node(7);
        Node c = new sizeOfLL().new Node(6);
        Node d = new sizeOfLL().new Node(8);
         a.next = b;
         b.next = c;
        c.next = d;

         System.out.print(countNumberOfNode(a));

    }
}
