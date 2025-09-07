import java.util.HashSet;

public class hashset_longest_consecutive_element {
    public static void main(String[] args) {
        HashSet<Integer>st=new HashSet<>();
        int[] arr={1,100,2,3,4,400};
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }
        int maxlen=1;
        for(int num:st){
        if(!st.contains(num-1)){
            int curr=num;
            int count=1;
            while(st.contains(curr+1)){
                count++;
                curr++;
            }
            if(maxlen<count){
                maxlen=count;
            }
        }
        }
        System.out.println(maxlen);
    }
}
