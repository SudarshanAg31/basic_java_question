//rotate the element z time in queue
import java.util.*;
public class queue_rotate_k_time {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        int x=5;
        int z=2;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Stack<Integer>st =new Stack<>();        
        for(int i=1;i<=z;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i =1;i<=x-z;i++){
            int temp=0;
            temp=q.remove();
            q.add(temp);
        }
        System.out.println(q);
    }
}
