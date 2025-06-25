public class recursion_binary_search {
    public static int target(int[] arr,int start,int end,int tar) {
    if(start>end)return -1;
        int mid=start+((end-start)/2);//use this formula for mid because it's helpful for overflow
        if(tar==arr[mid])
            return mid;
        else if(tar>arr[mid])
           return target(arr, mid+1, end, tar);
        else
           return target(arr, start, mid-1, tar);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88};
        int e=arr.length;
        int t=44;
        int ans=target(arr,0,e-1,t);
        System.out.println(ans);
    }
}
