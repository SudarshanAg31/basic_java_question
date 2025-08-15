
import java.util.*;

public class queue_first_negative_in_each_window_of_size_k {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        int[] arr={1,-3,4,5,6,-6,8,10,13,-1};
        int n=arr.length;
        int k=3;
        int[] ans=new int[n-k+1];
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                q.add(i);
            }
        }
        for(int i=0;i<ans.length;i++){
            if(q.isEmpty()){
                break;
            }
            if(q.peek()>=i&&q.peek()<=(i+3)){
                ans[i]=arr[q.peek()];
            }
            if(q.peek()<i){
                q.remove();
            }
            else if(q.peek()>=i+3){
                ans[i]=0;
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
