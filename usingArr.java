package queue;

public class usingArr {
    static class Queue {
        static int[] arr;// static ees liye lete taaki hum eesko har jgh access kr paye.
        static int size; // array ka size hai jo aayega
        static int rear = -1; // rear always start from -1.

        Queue(int n) {
            arr = new int[n]; // jo size aayega ussi size ka aaray define kiya hai
            this.size = n; // size ko store kra liya hai yaha pr
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // enqueue
        public static void add(int data) {
            // check queue is full or not,if queue is full then simply return
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            // if it is not fulll then---------
            // increase rear
            // store data at rear bcz starting me rear -1 pe hai to rear++ krne k baad ye
            // 0th index ko point krega or waha hum data daal denge
            rear++;
            arr[rear] = data;
        }


        // dequeue
        // deque me hum front se data ko remove kr rhe honge.

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            // front element ko delete krne k liye hum usse ek varable me store krayenge 
            //uske baad jo bache element hai unko aange shift krenge

            int front = arr[0];

            //rear--; statement should be added as we shifted all elem. to previous place so now 
            // our rearv should also shift to its previous place.
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];

            }
            rear--;
            return front;
        }
        
        //peek

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            return front;
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
      
        q.add(1);
        q.add(2);
        q.add(3);
       
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
