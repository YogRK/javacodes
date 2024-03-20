import java.util.*;

public class equilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        prefixSum(arr,n);
    }
    public static void prefixSum(int[] arr,int n){
        long[] prefixArr = new long[n];
        prefixArr[0] = arr[0];
        
        for(int i=1;i<n;i++){
          prefixArr[i] = prefixArr[i-1]+arr[i];
        }
        equlibrium(prefixArr,n);
    }
    static void equlibrium(long[] newArr,int n){
        int count=0;
        for(int i =0;i<n;i++){
            long sumLeft;
            if(i==0){
                sumLeft = 0;

            }
            else{
                sumLeft = newArr[i-1];
            }
            long sumRight = newArr[n-1] - newArr[i];
            if(sumLeft == sumRight){
                count++;
            }

        }
        System.out.print("Number of equilibrium index is : "+count);
    }
}
