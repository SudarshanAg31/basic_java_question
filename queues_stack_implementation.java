//this is peek effective
import java.util.*;

public class queues_stack_implementation {
    public static class stack{
        Queue<Integer>q=new LinkedList<>();
        public void push(int val) {
            q.add(val);
        }
        public int pop() {
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
            int val=q.peek();
            q.remove();
            return val;                        
        }
        public int peek() {
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
            int val=q.peek();
            q.add(q.remove());
            return val;
        }
        public void print(){
            System.out.println(q);
        }
        public boolean empty() {
            if(q.isEmpty())return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.print();
        st.pop();
        st.print();
        System.out.println(st.peek());
        System.out.println(st.empty());

    }
}
