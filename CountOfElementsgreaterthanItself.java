//Given an array return the count of all elements having atleast
// one element greater than itself



import java.util.*;

class CountOfElementsgreaterthanItself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
       }
       System.out.print("The atleast greater element in array is : "+atLeastGreater(arr));
    }
    public static int atLeastGreater(int[] arr){
       int count = 0;
       int max = Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i] >= max){
            max = arr[i];
            count++;
        }
       }
       int ans = (arr.length + 1)- count;

       return ans;
    }
}
