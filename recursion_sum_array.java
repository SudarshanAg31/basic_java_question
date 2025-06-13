public class recursion_sum_array {
    public static int sum_array(int[] arr,int x) {
        if(x==0){
            return arr[0];
        }
        int y=sum_array(arr, x-1);
        int ans=y+arr[x];
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int x=sum_array(arr,arr.length-1);
        System.out.println(x);
    }
}
