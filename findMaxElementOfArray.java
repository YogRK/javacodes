import java.util.*;


class findMaxElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum element of given array is : "+ findMax(arr));
    }
    public static int findMax(int[] arr){
        int size = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else{
                continue;
            }
        }
        return max;
    }
}
