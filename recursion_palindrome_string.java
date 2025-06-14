public class recursion_palindrome_string {
    public static boolean  printn(String s,int start,int end) {
        if(start>=end){
            return true;
        }
        return (s.charAt(start)==s.charAt(end)&&printn(s, start+1, end-1));
    }
    public static void main(String[] args) {
        String s="level";
        boolean ans=printn(s,0,s.length()-1);
        System.out.println(ans);
    }
}
