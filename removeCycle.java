package LinkedList;

public class removeCycle {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;

        }
    }
    public static Node removeCycleFromLL(Node head){
        // first find cycle is present or not
        Node slow = head,fast = head;
        boolean isCycle = false;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        if(isCycle == false){
            return null;
        }
        Node p1=head,p2 = slow;

        while(p1.next != p2.next){
            p1 = p1.next;
            p2 = p2.next;
        }
        // make null 
        p2.next = null;

        return head;
    }
    public static void  printLL(Node head){
       Node current = head;
       while(current != null){
        System.out.print(current.val+"->");
        current = current.next;
       }
       System.out.println("null");
    }
    public static void main(String[] args) {
        Node a = new removeCycle().new Node(1);
        Node  b = new removeCycle().new Node(2);
        Node  c = new removeCycle().new Node(3);
        Node  d = new removeCycle().new Node(4);
        Node  e = new removeCycle().new Node(5);
        Node  f = new removeCycle().new Node(6);
        Node  g = new removeCycle().new Node(7);
        Node  h = new removeCycle().new Node(8);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = e;

        Node head = removeCycleFromLL(a);
        printLL(head);
    }
}
