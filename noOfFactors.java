import java.util.*;

public class noOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print("Number of factors of given number : "+factors(num));
    }
    static int factors(int num){
        int count = 0;
        for(int i =1;i*i<=num;i++){
            if(num % i == 0){
              if(i == num / i){ // here we don't use % becuse it gives remainder 
                count = count+1;
            } 
          else{
            count = count+2;
          }  
            
        }
        
    }
    return count;
}
}

