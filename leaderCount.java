import java.util.*;
public class leaderCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        leader(arr,n);
    }
/* 
    // Brute force method
    public static void leader(int[] arr,int n){
      int count =1;
      
      for(int i=1;i<n;i++){
        boolean flag = true;
        for(int j=0;j<i;j++){
            if(arr[j] > arr[i]){
                flag = false;
            }
        }
        if(flag == true){
            count++;
        }
        
      }
      System.out.print(count);
    }    
  */

  //Optimed form

  static void leader(int[] arr,int n){
    int count =1;
    int max = arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]>max){
            count++;
            max = arr[i];
        }
    }
    System.out.println(count);
  }
}
