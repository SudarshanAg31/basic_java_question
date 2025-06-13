public class recursion_linear_search {
    public static boolean  linear_search(int[] arr,int x,int ans) {
        if(x<0){
            return false;
        }
        if(arr[x]==ans){
            return true;       
        }
        return linear_search(arr, x-1,ans);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int ans=5;
        boolean y=linear_search(arr,arr.length-1,ans);
        System.out.println(y);
    }
}
