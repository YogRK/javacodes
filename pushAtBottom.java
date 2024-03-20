package stackLearn;

import java.util.*;

public class pushAtBottom {
    public static void pushBottom(int data, Stack<Integer> s) {
    // jb stack empty ho jayega to hum apne data ko push krenge or return kr jayenge.
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop(); // pehle top ko remove krte jao
        pushBottom(data, s); // sare elements ko remove krne k liye recursion ka use kr rhe hai
        s.push(top);  //uske baad top me push krna hai
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(12);
        s.push(4);

        pushBottom(5, s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
