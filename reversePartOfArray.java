import java.util.*;

public class reversePartOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the start index : ");
        int a = sc.nextInt();
        System.out.print("Enter the end index : ");
        int b = sc.nextInt();
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reversePartarrelement(arr,a,b);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static int[] reversePartarrelement(int[] arr,int a,int b){
        
        int size = arr.length;
        int p1 = a;
        int p2 = b;
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
