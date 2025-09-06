import java.util.*;
public class hashmap_subarray_sum_0 {
    public static void main(String[] args) {
        int [] arr={15,-2,2,-8,1,7,10};
        Map<Integer,Integer>mp=new HashMap<>(); 
        int sum=0;
        int ans=0;
        mp.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(mp.containsKey(sum)){
                ans=Math.max(ans, i-mp.get(sum));
            }
            else{
                mp.put(sum,i);
            }
        }
        System.out.println(ans);
    }
}
