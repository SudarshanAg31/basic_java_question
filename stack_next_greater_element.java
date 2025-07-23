import java.util.Stack;
public class stack_next_greater_element {
    public static int[] nxt_ele(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int[] res=new int[arr.length];
        res[res.length-1]=-1;
        st.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<st.peek()) res[i]=st.peek();
            else{
            while(!st.isEmpty()&&st.peek()<arr[i]){
                st.pop();
            }
            if(!st.isEmpty())res[i]=st.peek();
            else res[i]=-1;
            }
        st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        int[] res=nxt_ele(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
