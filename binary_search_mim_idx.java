public class binary_search_mim_idx {
    public static int low_find(int[] arr,int s,int e) {
        int ans=-1;
        while(s<=e){
            int mid=s+((e-s)/2);
            if(arr[mid]>arr[arr.length-1]){
                s=mid+1;
            }
            else if(arr[mid]<arr[arr.length-1]){
                ans=mid;
                e=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,10,1,2,3,4};
        int ans=low_find(arr,0,arr.length-1);
        System.out.println(ans);
    }
}