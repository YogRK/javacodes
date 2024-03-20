import java.util.*;

class reverseOfArray {
    public static void main(String[] args) {
      Scanner ac = new Scanner(System.in);
      int n = ac.nextInt();
      int[] arr = new int[n];
      for(int i =0;i<n;i++){
        arr[i] = ac.nextInt();
      }  
      reverseArray(arr);
      for(int i:arr){
        System.out.print(i + " ");
      }

    }
    public static int[] reverseArray(int[] arr){
      int size= arr.length;
        int p1 = 0;
        int p2 = size-1;
        while(p1<p2){
          //Swap elements
          int temp = arr[p1];
          arr[p1] = arr[p2];
          arr[p2] = temp;
          p1++;
          p2--;

        }
        return arr;
    }
}
