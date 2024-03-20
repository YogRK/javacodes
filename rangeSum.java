import java.util.*;

public class rangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
       
        int n = sc.nextInt();
        int s = sc.nextInt();
        int e = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        cummulativeSum(arr,n,s,e);

    }
    /* 
    Brute Force Method
    public static void rangeSumQuery(int[] arr,int start,int end){
        int p1 = start;
        int p2 = end;

        long sum = 0; we use log bcz integer can not strore more than 10^6 so we take long
        for(int i = p1;i<=p2;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
           
    }
    */
    /*best Approach
        1) find the commulative sum and create a new array assign the sum of into the new array
        
        2)then find sum using newArray[L,R] = newArray[R] -arr[L-1];
       */
    static void cummulativeSum(int[] arr,int n,int start,int end){
        long[] newArray = new long[n];
        newArray[0] = arr[0];
        for(int i =1;i<n;i++){
            newArray[i] = newArray[i-1] + arr[i];
        }
        for(int i =0;i<n;i++){
            System.out.print(newArray[i]+" ");
        }
        if(start == 0){
            System.out.println("output "+newArray[end]);
        }
        else{
            System.out.println("output "+(newArray[end] - newArray[start-1]));
        }
    }
}
