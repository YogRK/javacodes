

public class deleteNodeInLL {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static Node deleteNode(Node head,int idx){
        Node t1 = head;
        
        if(idx == 0){// this to delete the head
            Node nn = head.next;
            head.next =null;
            return nn;
        }else{
            for(int i =0;i<idx-1;i++){
                t1=t1.next;
            }
        Node t2 = t1.next;
        t1.next = t2.next;
        return head;
        }
    }
    public static void printLL(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.val+"->");
            current= current.next;
        }
        System.err.println("null");
    }
    public static void main(String[] args) {

        int index = 0;
        // create ll
        Node a = new deleteNodeInLL().new Node(5);
        Node b = new deleteNodeInLL().new Node(6);
        Node c = new deleteNodeInLL().new Node(7);
        Node d = new deleteNodeInLL().new Node(9);
        Node e = new deleteNodeInLL().new Node(8);
        Node f = new deleteNodeInLL().new Node(9);
        Node g = new deleteNodeInLL().new Node(10);

        // now create connection
        a.next = b;
        b.next = c;
        c.next  = d;
        d.next = e;
        e.next = f;
        f.next = g;
        
        a=deleteNode(a,index);
        printLL(a);
        

    }
    
}
