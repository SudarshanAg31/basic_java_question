
import java.util.ArrayList;

public class recursion_subsquence_string {
    public static ArrayList<String> printn(String s) {
        ArrayList<String> ans=new ArrayList<>();
        //base case
        if(0==s.length()){
            ans.add("");
            return ans;
        }
        //sun problem
        char curr=s.charAt(0);
        ArrayList<String> sub=printn(s.substring(1));
        //self work
        for(String ss: sub){
        ans.add(ss);
        ans.add(curr+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        String x="abc";
        ArrayList<String> ans=printn(x);
        System.out.println(ans);
    }    
}
