package stackLearn;
import java.util.*;

public class basicOfStack {
    public static void main(String[] args) {
        Stack <Integer> st = new  Stack<>();
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(11);
        st.push(12);
        st.push(51);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.print(st.pop());
        System.out.println(st);

         
    }
}
