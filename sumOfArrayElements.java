import java.util.*;

class sumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //sumOfElements(arr);
        System.out.print("the sum of elements of Array is : "+ sumOfElements(arr));
    }
    public static int sumOfElements(int[] arr){
        int sum =0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
