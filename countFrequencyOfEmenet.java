import java.util.*;

class countFrequencyOfEmenet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
         int k = sc.nextInt();
        System.out.print("Frequency of "+k+" element is "+countFrequency(arr,k));
    }
    public static int countFrequency(int[] arr,int k){
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == k){
                count++;
            }
        }
        return count;
    }
    
}
