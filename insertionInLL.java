import java.util.*;

public class insertionInLL {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node insertAtIndex(Node head, int value, int idx) {
        Node newNode = new insertionInLL().new Node(value);

        if (idx == 0) {
            newNode.next = head;
            return newNode;

        } else {
            Node t1 = head;

            // this loop is used to get the index or node where we have to insert the
            // newNode
            for (int i = 0; i < idx - 1; i++) {
                t1 = t1.next;
            }
            Node t2 = t1.next;
            t1.next = newNode;
            newNode.next = t2;
            return head;
        }

    }

    public static void printLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int index = 3;
        int val = 8;
        Node a = new insertionInLL().new Node(5);
        Node b = new insertionInLL().new Node(6);
        Node c = new insertionInLL().new Node(7);
        Node e = new insertionInLL().new Node(9);
        Node f = new insertionInLL().new Node(10);
        Node g = new insertionInLL().new Node(11);

        a.next = b;
        b.next = c;
        c.next = e;
        e.next = f;
        f.next = g;

        a = insertAtIndex(a, val, index); // here we function to Capture the modified list after insertion
        printLL(a);

    }
}
