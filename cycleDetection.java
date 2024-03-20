package LinkedList;

import java.util.HashSet;

public class cycleDetection {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next=null;
        }
    }
    public static boolean usingFlodwarshellCheck(Node head){
        Node slow = head,fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;                        
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static boolean usingHashSetCheck(Node head){
        // using hashSet
        HashSet<Node> hs = new HashSet<>();
        Node temp = head;
        while(temp != null){
            if(hs.contains(temp)){
                return true;
            }
            hs.add(temp);
            temp = temp.next;
        }
        return false;

    }
    public static void main(String[] args) {
        Node a = new cycleDetection().new Node(5);
        Node b = new cycleDetection().new Node(6);
        Node c = new cycleDetection().new Node(8);
        Node d = new cycleDetection().new Node(9);
        Node e = new cycleDetection().new Node(10);
        Node f = new cycleDetection().new Node(11);
        Node g = new cycleDetection().new Node(12);
        Node h = new cycleDetection().new Node(13);

        // make connections
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = g;
        g.next = h;
        h.next = d;
        

        // using hashSet 
        // boolean bool = usingHashSetCheck(a);
        
         // using floyd cycle detection
       boolean bool= usingFlodwarshellCheck(a);
       System.out.println(bool);

    }

}
