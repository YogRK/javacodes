import java.util.*;

public class deleteElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int element = sc.nextInt();
        System.out.print("Enter the position of element : ");
        int position = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] arr1 = deleteElement(arr,position);
        System.out.print("Elements after deletion : ");
        for(int i : arr1){
            System.out.print(i+" ");
        }
    }
    public static int[] deleteElement(int[] arr,int position){
        int n = arr.length;
        int index = position-1;
        int[] output = new int[n-1];
        for(int i =0;i<index;i++){
            output[i] = arr[i];
        }
        for(int i = index;i<n-1;i++){
            output[i] = arr[i+1];
        }
        return output;
    }
}
