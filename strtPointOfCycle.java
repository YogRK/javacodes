package LinkedList;

public class strtPointOfCycle {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static Node startingPointOfCycle(Node head){
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
        Node p1 = head,p2 = slow;
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    public static void main(String[] args) {
        Node  a = new strtPointOfCycle().new Node(1);
        Node  b = new strtPointOfCycle().new Node(2);
        Node  c = new strtPointOfCycle().new Node(3);
        Node  d = new strtPointOfCycle().new Node(4);
        Node  e = new strtPointOfCycle().new Node(5);
        Node  f = new strtPointOfCycle().new Node(6);
        Node  g = new strtPointOfCycle().new Node(7);
        Node  h = new strtPointOfCycle().new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = e;

        // using floyd
        Node startOfCycle = startingPointOfCycle(a);
        System.out.print(startOfCycle.val);  

    }
}
