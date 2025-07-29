
import java.util.Stack;

public class try1 {
public static Stack<Integer> ans(int[] arr) {
    Stack<Integer> st=new Stack<>();
    st.push(arr[0]);
    for(int i=1;i<arr.length;i++){
        if(st.isEmpty()||st.peek()!=arr[i]){
            st.push(arr[i]);
        }
        else{
            while(i<arr.length&&st.peek()==arr[i])i++;
            i--;
            st.pop();
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
