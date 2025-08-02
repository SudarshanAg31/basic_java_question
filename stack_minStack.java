
import java.util.Stack;

public class stack_minStack {
    public static class stack{
        Stack<Integer>st=new Stack<>();
        Stack<Integer>min=new Stack<>();
        
        public void push(int val) {
            st.push(val);
            if(min.size()==0){
                min.push(val);
            }
            else if(val>min.peek()){
                min.push(min.peek());
            }
            else{
                min.push(val);
            }
        }
        public void pop() {
            st.pop();    
            min.pop();
        }        
        public int top() {
            return st.peek();
        }        
        public int minval() {
            return min.peek();
        }
        public void print() {
            for (int val : st) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.print();
        System.out.println(st.minval());

    }
}
