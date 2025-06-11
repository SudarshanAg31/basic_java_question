public class recursion_check_inc {
    public static boolean printn(int x,int[] arr) {//3 2 1
    if(x==0) return true;
    else if(arr[x]>arr[x-1]){//t t t
    return printn(x-1, arr);//2 1
    }
    return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int x=arr.length;
        boolean ans=printn(x-1,arr);
        System.out.println(ans);
    }
}
