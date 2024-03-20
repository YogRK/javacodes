import java.util.*;

public class rotateKTimeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        rotateArray(arr,k);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
    static int[] rotateArray(int[] arr,int k){

        int n = arr.length;
        //if k is less than size of array
        if(k > n){
            k= k%n;
        }
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
        return arr;
    }
    static int[] reverseArray(int[] arr,int s,int e){
        int p1 = s;
        int p2 = e;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        return arr;
    }

}
