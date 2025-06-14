import java.util.ArrayList;
import java.util.Collections;
public class recursion_linear_search_ArrayList {
    public static ArrayList<Integer> return_all_index(int[] arr,int x,int len) {
        if(len<0){
            return new ArrayList<>();//empty array list
        }
        ArrayList<Integer> ans=new ArrayList<>();
        if(arr[len]==x){
            ans.add(len);
        }
        ArrayList<Integer>smallans=return_all_index(arr, x, len-1);
        ans.addAll(smallans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,5};
        int x=2;
        ArrayList<Integer> ans=return_all_index(arr,x,arr.length-1);
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
