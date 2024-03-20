import java.util.*;

public class increaseByOne {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(7);
         al.add(4);
          al.add(1);
           al.add(8);
            al.add(5);
             al.add(2);
              al.add(6);
              System.out.print("ArrayList before the increment : "+al);
              ArrayList<Integer> ans = increaseByOne(al);
              System.out.print("ArrayList after the increment : "+ans); 
    }
    public static ArrayList<Integer>  increaseByOne(ArrayList<Integer> al){
          int size = al.size();
          for(int i =0;i<size;i++){
            //get the element
            int num = al.get(i);
            //incremnet by one
            al.set(i,num+1);
          }
          return al;
    }
}
