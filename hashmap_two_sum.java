import java.util.HashMap;
import java.util.Map;

public class hashmap_two_sum {
    public static void main(String[] args) {
    Map<Integer,Integer>mp=new HashMap<>();
    int[] arr={1,5,7,-1};
    int target=6;
    int[] ans={-1};
    // mp.put(arr[0], 0);
    for(int i=0;i<arr.length;i++){
        int x=target-arr[i];
        if(mp.containsKey(x)){
            ans=new int[]{mp.get(x),i};
            break;
        }
        else{
            mp.put(arr[i],i);
        }
    }
    for(int i=0;i<ans.length;i++){
        System.out.println(ans[i]+" ");
    }

}
}
