public class reverseLL {
    // Extra space is not allowed
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static  Node reverseLinkedList(Node head){
        Node prev = null; // ye previous node jo ki null hai usse point krega or baad me update hota rhega
        Node current = head; // head to current me store krayenge taaki connection naa tooote
       

        while(current != null){
            Node nextNode = current.next;// to update the next Node 
            current.next = prev;
            prev = current;
            current = nextNode; 
        }
        return prev;

    }
    public static void printLL(Node head){
        Node current = head;
        while (current != null){
            System.out.print(current.val+"->");
            current = current.next;
        } 
        System.out.println("null");    
        
    }

    public static void main(String[] args) {
        Node a = new reverseLL().new Node(5);
        Node b = new reverseLL().new Node(6);
        Node c = new reverseLL().new Node(7);
        Node d = new reverseLL().new Node(8);
        Node e = new reverseLL().new Node(9);

        // create connection
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        a=reverseLinkedList(a);
        printLL(a);
        
    }
    
}
