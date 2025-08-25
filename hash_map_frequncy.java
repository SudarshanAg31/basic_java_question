import java.util.*;
public class hash_map_frequncy {
    public static void main(String[] args) {
        Map<Integer,Integer>mp=new HashMap<>();
        int[] arr={1,2,3,1,2,1,1};
        for(int i=0;i<=arr.length-1;i++){
            if(mp.containsKey(arr[i])==true){
                int x=mp.get(arr[i]);
                x+=1;
                mp.put(arr[i], x);
            }
            else{
                mp.put(arr[i], 1); 
            }
        }
        System.out.println(mp);
    }
}
