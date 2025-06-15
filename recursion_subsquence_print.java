public class recursion_subsquence_print {
    public static void printn(String s,String curr) {
        if(s.length()==0){
            System.out.println(curr);
            return;
        }
        char a=s.charAt(0);
        String sub=s.substring(1);
        printn(sub,curr+a);
        printn(sub,curr);
    }
    public static void main(String[] args) {
        String s="abc";
        printn(s,"");
    }
}
