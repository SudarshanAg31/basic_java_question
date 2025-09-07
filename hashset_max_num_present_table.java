
import java.util.HashSet;

public class hashset_max_num_present_table {
    public static void main(String[] args) {
        int[]arr={2,1,1,3,2,3};
        int maxlen=0;
        HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!st.contains(arr[i])){
                st.add(arr[i]);
                int size=st.size();
                if(size>maxlen){
                    maxlen=size;
                }
            }
            else{
                st.remove(arr[i]);
            }
        }
        System.out.println(maxlen);
    }
}
