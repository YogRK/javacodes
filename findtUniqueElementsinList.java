import java.util.*;

public class findtUniqueElementsinList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
         al.add(10);
          al.add(20);
           al.add(30);
            al.add(40);
             al.add(40);
             ArrayList<Integer> output = uniqueElements(al);
             System.out.println(output);

    }
    static ArrayList<Integer> uniqueElements(ArrayList<Integer> al){
        int n = al.size();
      
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            int num = al.get(i);
              int freq = 0;     // Reset the frequency for each new element
            for(int j =0;j<n;j++){
                if(num == al.get(j)){
                    freq++;
                }
            }
            if(freq == 1){
                ans.add(num);
            }
        }
        return ans;
    }
}
