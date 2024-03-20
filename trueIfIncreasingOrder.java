import java.util.*;

class trueIfIncreasingOrder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.print(checkIncreasing(arr,n));
  }    
  public static boolean checkIncreasing(int[] arr, int n){
    for(int i = 0;i<n;i++){
        if (arr[i] < arr[i-1]) {
            return false;
        }
    }
    return true;
  }
}
