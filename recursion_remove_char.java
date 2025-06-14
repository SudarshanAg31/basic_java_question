public class recursion_remove_char {
public static String remove_char(String s,int x){
   //base case
    if(x==s.length()){
        return "";
    }
    //short ans
    String sans=remove_char(s, x+1);
    //self work
    char curent_ans=s.charAt(x);  
    if(curent_ans!='a'){
        return curent_ans+sans;
    }
    else{
        return sans;
    }
}
    public static void main(String[] args) {
        String s="abcax";
        String ans=remove_char(s,0);
        System.out.println(ans);
    }
}
