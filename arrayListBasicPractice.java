import java.util.*;

public class arrayListBasicPractice {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        // add elements
        al.add(10);
        al.add(20);
        al.add(32);
        System.out.println(al);
        System.out.println(al.size());// this size
        System.out.print(al.get(1));
        //Upadte existing element
        al.set(0,30);
         System.out.println(al);
        //remove element
        al.remove(1);
        System.out.println(al);
        al.add(10);
        System.out.println(al);
// Sort elements using function
        Collections.sort(al);
        System.out.println(al);
    }
}
