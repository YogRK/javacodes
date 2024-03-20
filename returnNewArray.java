import java.util.*;

class returnNewArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        
         // Call the function to get a new array
         int[] arr = newReturnArray(n);
         //use for loop to print the array
         for(int i:arr){
            System.out.print(i + " ");
         }
    }
    
    static int[] newReturnArray(int n){
        int[] newArr = new int[n];
        for(int i = 0;i<n;i++){
            newArr[i] = i + 1; 
        } 
        return newArr;
    }
}
