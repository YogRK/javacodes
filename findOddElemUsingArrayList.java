import java.util.ArrayList;

 class findOddElemUsingArrayList {
     public static void main(String[] args) {
      ArrayList<Integer> al = new ArrayList<>();
      al.add(5);
      al.add(4);
      al.add(7);
      al.add(5);
      al.add(2);
    System.out.println("List"+al);
    ArrayList<Integer> output = oddFound(al);
    System.out.print("The list of elements who are odd is : "+output);
}
static ArrayList<Integer> oddFound(ArrayList<Integer> al){
    int n = al.size();
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i =0;i<n;i++){
        int num = al.get(i);
        if(num % 2 != 0){
            ans.add(num);
        }

    }
    return ans;
}
 }
