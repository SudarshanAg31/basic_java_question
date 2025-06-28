public class binary_search_peak_idx_mountain_array {
    public static int peak_idx(int[] arr,int s,int l) {
        int ans=-1;
        while(s<=l){
            int mid=s+((l-s)/2);
            if(arr[mid]<arr[mid+1]){
                ans=mid+1;
                s=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,3,1,0};
        int ans=peak_idx(arr,0,arr.length-1);
        System.out.println(ans);
    }
}
