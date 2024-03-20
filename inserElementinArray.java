import java.util.*;

public class inserElementinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int elem=sc.nextInt();
        int position = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //we use arr2 because we return array and this array is used to assign th evalue of return array
        //and print it.
        int[] arr12 = inserElement(arr,elem,position);
        System.out.print("the new array after insert : ");
        for(int i:arr12){
            System.out.print(i+" ");

        }
    }
    public static int[] inserElement(int[] arr,int elem,int position){
        int size = arr.length;
        int index= position-1;
        int[] output = new int[size+1];
        for(int i =0;i<index;i++){
            output[i] = arr[i];
        }
        for(int i = index;i<=(size-1);i++){
            output[i+1] = arr[i];
        }
        output[index]  = elem;
        return output;
    }
}
