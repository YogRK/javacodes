

// Slow and fast Approch

package LinkedList;

public class midOfLL {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static Node midOfLinkedList(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;  // slow is going 1 step
            fast = fast.next.next; // fast is going two steps
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new midOfLL().new Node(5);
        Node b = new midOfLL().new Node(6);
        Node h = new midOfLL().new Node(7);
        Node d = new midOfLL().new Node(9);
       Node l = new midOfLL().new Node(10);
      Node c = new midOfLL().new Node(11);
      Node e = new midOfLL().new Node(11);

        a.next = b;
        b.next = h;
       h.next = d;
       d.next = l;
       l.next = c;
       c.next = e;

        Node mid =midOfLinkedList(a); // mid is taking to store the return node 
        
        System.out.println(mid.val);
    }
}
