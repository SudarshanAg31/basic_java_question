
import java.util.Stack;

public class stack_remove_consecutive_subsequences {
    public static Stack<Integer> ans(int[] arr) {
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){//2
            if(!st.isEmpty()&&st.peek()==arr[i]){
                int x=i+1;
                while(x<arr.length&&st.peek()==arr[x]){
                    x++;
                }
                st.pop();
                i=x-1;
            }
            else{
                st.push(arr[i]);
            }
        }
        return st;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,4,4,5,6,7,7,7,7};
        Stack<Integer> st=ans(arr);
        System.out.println(st);
    }
}
