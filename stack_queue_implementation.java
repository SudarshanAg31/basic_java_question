//peek efficent
import java.util.Stack;

public class stack_queue_implementation {
    public static class queue{
        Stack<Integer>st=new Stack<>();
        Stack<Integer>st1=new Stack<>();
        
        public void push(int val) {
            st.push(val);
        }
        public int peek() {
            while(st.size()!=1){
                st1.push(st.pop());
            }
            int x=st.peek();
            while(st1.isEmpty()){
                st.push(st1.pop());
            }
            return x;
        }
        public int pop() {
            while(st.size()!=1){
                st1.push(st.pop());
            }
            int x=st.peek();
            st.pop();
            while(st1.size()!=0){
                st.push(st1.pop());
            }
            return x;
        }
        public void print(){
            System.out.println(st);
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.print();
        System.out.println(q.pop());
        q.print();
        System.out.println(q.peek());

    }
}
