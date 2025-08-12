//reverse the queue with the help of stack
import java.util.*;

public class queue_reverse {
   public static void main(String[] args) {
    Queue<Integer> q=new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    Stack<Integer> st=new Stack<>();
    while(q.peek()!=null){
        st.push((q.remove()));
    }
    while (!st.isEmpty()) {
        q.add(st.pop());
    }
    System.out.println(q);
    } 
}
