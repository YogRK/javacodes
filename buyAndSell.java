import java.util.*;

public class buyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        maxBuyAndSell(arr,n);
    }
    public static void maxBuyAndSell(int[] arr,int n){
        int maxProfit = 0;
        int minSoFar = arr[0];
        for(int i =0;i<n;i++){
            minSoFar = Math.min(minSoFar,arr[i]);
            int profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit); 
        }
        System.out.println(maxProfit);
    } 
}
