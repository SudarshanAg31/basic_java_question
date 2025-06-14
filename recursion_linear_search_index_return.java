public class recursion_linear_search_index_return {
    public static int index_return(int[] arr,int x,int len) {
        if(len<0){
            return -1;
        }
        if(arr[len]==x){
            return len;
        }
        else{
            return index_return(arr, x, len-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int x=1;
        int y=index_return(arr,x,arr.length-1);
        System.out.println(y);
    }
}