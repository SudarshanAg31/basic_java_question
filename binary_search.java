public class binary_search {
    public static int target(int[] arr,int s,int e,int tar) {    
        while(s>=e){
           int mid=(s+e)/2;
            if(tar>arr[mid]){
                s=mid+1;
            }
            else if(tar<arr[mid]){
                e=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88};
        int e=arr.length;
        int t=-1;
        int ans=target(arr,0,e-1,t);
        System.out.println(ans);
    }
}
