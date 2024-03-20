import java.util.*;


class basicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 
        int ar[] = new int[3];
        ar[0] = 10;
        ar[1] = 20;
        ar[2] = 30;
        */

     //   System.out.println(ar[0]);

     // second array is created like this now ar is pointed to this arraya not fist array

      //int[] ar = {10,20,30};
     // System.out.println(ar[0]); // hyere output is zero bc we not assign  the value to this array
      //System.out.print(ar.length); 




      //Now take the element from the user
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      //now print
      printArray(arr);
      }
      public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }


    }
    
}
