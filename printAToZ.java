import java.util.*;

public class printAToZ {
    public static void main(String[] args) {
       // for(int i = 65;i<91;i++){
            //idea 1
          //  System.out.println(i);// it will print numbers from 65 to 90;
          //  System.out.println((char)i);//to print character we use typecasting here bcz i is integer
          

          //idea 2
          // we can alse use like this for typecasting
        //   char ch = (char)i;
        //   System.out.println(ch);
           
          //idea 3
        // we can also do like this
        for(int i='a';i<= 'z';i++){
            char ch = (char) i;
            System.out.println(ch);
        }
        }
    }

