import java.util.*;

class findMinElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("Minimum element of given array is "+findMinElement(arr));
    }
    public static int findMinElement(int[] arr){
        int size=arr.length;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<size;i++){
            if(arr[i] < min){
                min = arr[i];
            }else{
                continue;
            }
        }
        return min;
    }
}
