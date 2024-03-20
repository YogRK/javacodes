import java.util.*;

public class upperToLowerCase {
    public static void main(String[] args) {
        char[] arr = new char[8];
        arr[0] = 'Y';
        arr[1] = 'o';
        arr[2] = 'G';
        arr[3] = 'e';
        arr[4] = 'n';
        arr[5] = 'd';
        arr[6] = 'r';
        arr[7] = 'A';
         System.out.println(arr);
        char[] ans = toggle(arr); // to store char array
        System.out.println(ans);
    }
    static char[] toggle(char[] arr){
        /*
         * Ascii vale A=65      a=97       "Note:So if we add 32 then we get lower case  
         *            B=66      b=91       and if we subtract 32 from lower case ascii vale
         *            C=67      c=92        the we get upper case value"
         *            .         .
         *            .         .
         *           Z = 90     z=122
         */
        int n = arr.length;
        for(int i =0;i<n;i++){
            char ch = arr[i]; 
            if(ch >= 65 && ch <= 90){ // for upper to lower
              arr[i] = (char)(ch+32);
            }else if(ch >= 97 && ch <= 122){ // for lowe to upper
                arr[i] = (char)(ch - 32);
            }
        }
        return arr;
    }
}
