package LinkedList;
import java.util.*;

public class deleteOperations {
    Node head;
    class Node{
        String data;
        Node next;
    
    Node(String data){      // Constructor
        this.data = data;
        this.next = next;
    }

    public void deleteFirst(String data){
        if(head == null){
            System.out.println("The list is Empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(String data){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next == null){
            head =null;
        }
        Node currentNode = head;
        
    }


    public static void main(String[] args) {
       
    }
}
}
