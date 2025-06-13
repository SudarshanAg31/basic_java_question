public class recursion_max_array {
public static int print_max(int[] arr,int x) {
    if(x==0){
        return arr[0];
    }
    int y=print_max(arr, x-1);
    if(y>arr[x]){
        return y;
    } 
    else{
        return arr[x];
    }

}
    public static void main(String[] args) {
        int[] arr={1,5,8,9};
        int x=print_max(arr,arr.length-1);
        System.out.println(x);
    }
}
