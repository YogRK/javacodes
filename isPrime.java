import java.util.*;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(primeIsNot(num));
    }
    static boolean primeIsNot(int num){
        int fact = factorial(num);
        if(fact == 2){
            return true;
        }
       return false;

    }
    static int factorial(int num){
        int count = 0;
        for(int i = 1;i*i<= num;i++){
             if(num % i ==0){
                if(num/i == i){
                    count = count + 1;
                }
                else{
                    count = count + 2;
                }
             }
        }
        return count;
    }
}
