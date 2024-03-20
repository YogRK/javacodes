package LinkedList;
import java.util.*;

public class createLL {
     Node head;

    // first create a node class
  class Node{
    String data;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;
    }
    // Node class is completed
    // 2nd now create a obeject in main method 
  }
 
  public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
  }
  public void addLast(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    Node currentNode = head;
    while(currentNode.next != null){
        currentNode = currentNode.next;
    }
    currentNode.next = newNode;
  }
  public void printList(){
    //print krne k liye hame sirf linked list ka head dena hota hai 
    if(head == null){
        System.out.println("list is empty");
    }
   Node currentNode = head;
    while(currentNode != null){
        System.out.print(currentNode.data + " -> ");
        currentNode = currentNode.next;
    }
    System.out.println("null");
  }
 public static void main(String[] args) {
    // creating a method
    createLL list = new createLL();
    // first operation we perform that is add frst
    list.addFirst("a");
    list.addFirst("b");
    list.printList();
    list.addLast("list");
    list.printList();
    list.addFirst("this");
    list.printList();



    
 }   
}
