package stackLearn;
import java.util.*;
public class implUsingArr {
     class stack{
        static int[] arr;
        static int last;
        stack(int n){
            arr = new int[n];
            last = -1;
        }
        static void push(int x){
            last++;
            arr[last] = x;
        }
        static int pop(){
            int temp = arr[last];
            arr[last] = 0;
            last--;
            return temp;
        }
        int peek(){
            return arr[last];
        }
        int size(){
            return last+1;
        }
        public static boolean isEmpty() {
            
            throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
      // Push elements onto the stack
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            stack.push(element);
        }

        // Pop elements from the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        sc.close();

    }
    
}
