import java.util.*;

public class countPairsCarryforward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        countPairs(arr, n);
        sc.close(); // Close the scanner to avoid resource leaks

    }
    /* 
    optimized form

    public static void countPairs(char[] arr,int n){
        int count = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'a') {
                count++;
            } else if (arr[i] == 'g') {
                ans = ans + count;
            }
        }
        System.out.println(ans);
        
    }
    */
        //Brute force method
        public static void countPairs(char[] arr,int n){
           int count = 0;
           for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == 'a' && arr[j] == 'g'){
                    count++;
                }
            }
           }
           System.out.print(count);
        }
    
}
