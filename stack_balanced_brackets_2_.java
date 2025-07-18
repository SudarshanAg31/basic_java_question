import java.util.Stack;
public class stack_balanced_brackets_2_ {
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.size()==0)return false;
                if(st.peek()=='('&&ch==')')st.pop();
                else if(st.peek()=='{'&&ch=='}')st.pop();
                else if(st.peek()=='['&&ch==']') st.pop();
                else return false;
            }
        }
        if(st.size()==0)return true;
        else return false;
}
    public static void main(String[] args){
        String str="([{{()}}])";
        System.out.println(isValid(str));
    }
}
