
import java.util.*;

public class queue_recorder_interleave_1_half_with_2_half{
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        Stack<Integer>st=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        int size=q.size();
        for(int i=1;i<=size/2;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i=1;i<=size/2;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println(q); 
    }
}
