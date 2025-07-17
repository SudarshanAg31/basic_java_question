import java.util.Stack;
public class stack_balanced_brackets {
    public static boolean ans(String str) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                st.push(str.charAt(i));
            }
            if(str.charAt(i)==')'){
                if(st.isEmpty())return false;
                st.pop();
            }
        }
        if(st.isEmpty())return true;
        else return false;
 }
    public static void main(String[] args) {
        String str="((((()))))";
        System.out.println(ans(str));
    }
}
