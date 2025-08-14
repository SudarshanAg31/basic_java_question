//pop efficient

import java.util.Stack;

public class stack_queue_2_implementation {
    public static class queue{
        Stack<Integer>st=new Stack<>();
        Stack<Integer>st1=new Stack<>();
        
        public void push(int val) {
           if(st.size()==0)st.push(val);
           else{
            while(!st.isEmpty()){
                st1.push(st.pop());
            }
            st.push(val);
            while(!st1.isEmpty()){
                st.push(st1.pop());
            }
           } 
        }
        public int peek() {
           return st.peek();
        }
        public int pop() {
            return st.pop();
        }
        public void print(){
            while(!st.isEmpty()){
                System.out.print(st.peek()+" ");
                st1.push(st.pop());
            }
            while(!st1.isEmpty()){
                st.push(st1.pop());
            }
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
        System.out.println();
        System.out.println(q.pop());
        q.print();
        System.out.println();
        System.out.println(q.peek());
        
        
    }
}
