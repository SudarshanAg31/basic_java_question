import java.util.Stack;
public class stack_next_greater_ele_2_ {
    public static int[] print(int[] arr) {
        Stack<Integer>st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
                ans[st.pop()]=arr[i];  
            }
            st.push(i);
        }
        while(!st.isEmpty()){
        ans[st.pop()]=-1;
    }
    return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,5,3,2,1,6,3,4};
        int [] ans=print(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
