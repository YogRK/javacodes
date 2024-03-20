import java.util.*;

public class countPairsWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        countSum(arr,k);
    }
    public static void countSum(int[] arr,int k){
        int size = arr.length;
        int count = 0;
        // for(int i =0;i<size;i++){
        //     for(int j=0;j<size;j++){
        //         if(i != j && arr[i] + arr[j] == k){
        //             count++;
        //         }
        //     }
        // }
        // System.out.print("Number of count is : "+count/2);

        //Using Staircase approach
        for(int i =0;i<size;i++){
            for(int j =i+1;j<size;j++){
                if(arr[i] + arr[j] == k){
                    count++;
                }
            }
        }
        System.out.print("Number of count is : "+count);
    }
}
