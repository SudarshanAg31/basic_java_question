public class recursion_linear_search_all_index {
    public static void return_all_index(int[] arr,int x,int len) {
        if(len<0){
            return;
        }
        if(arr[len]==x){
            System.out.print(len+" ");
        }
        return_all_index(arr, x, len-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,5};
        int x=2;
        return_all_index(arr,x,arr.length-1);
    }
}
