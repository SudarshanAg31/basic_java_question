public class binary_search_target_idx {
    public static int targ_idx(int[] arr,int s,int e,int tar) {
        int ans=-1;
        while(s<=e){
            int mid=s+((e-s)/2);
            if(tar==arr[mid]){
                ans=mid;
                return ans;
            }
            else if(arr[mid]<arr[e]){
                if(arr[mid]<tar&&arr[e]>=tar){
                    s=mid+1;
                }
                else e=mid-1;
            }
            else{
                if(tar>=arr[s]&&tar<arr[mid]){
                    e=mid-1;
                }
                else s=mid+1;
            }
        }
        return ans; 
    }
    public static void main(String[] args) {
        int[] arr={6,7,8,9,10,11,12,1,2,3,4,5};
        int tar=5;
        int ans=targ_idx(arr,0,arr.length-1,tar);
        System.out.println(ans);
    }
}
