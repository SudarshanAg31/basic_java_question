//this is pop effective

import java.util.*;

public class queues_stack_2_implementation {
        public static class stack{
        Queue<Integer>q=new LinkedList<>();
        public void push(int val) {
            q.add(val);
            for(int i=1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
        }
        public int pop() {
            return q.remove();                       
        }
        public int peek() {
            return q.peek();
        }
        public void print(){
            int[] arr=new int[q.size()];
            for(int i=0;i<=q.size()-1;i++){
                arr[i]=q.peek();
                q.add(q.remove());
            }
            for(int i=q.size()-1;i>=0;i--){
            System.out.print(arr[i]+" ");
            }
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
        // st.pop();
        // st.print();
        // System.out.println(st.peek());
        // System.out.println(st.empty());

       
    }
}
