public class recursion_reverse_string {
    public static String reverse_string(String s,int index) {
        //base case
        if(index==s.length()){
            return "";
        }
        //short ans
        String sans=reverse_string(s, index+1);
        //self work
        String ans=sans+s.charAt(index);
        return ans;
    }
    public static void main(String[] args) {
        String s="abcde";
        String ans=reverse_string(s,0);
        System.out.println(ans);
    }
    
}
