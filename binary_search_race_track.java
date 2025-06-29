public class binary_search_race_track {
    static boolean ispossible(int mid,int[] arr,int no_kid){
        int kidplace=1;
        int lastkid=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastkid>=mid){
                kidplace++;
                lastkid=arr[i];
            }
        }
        return kidplace>=no_kid;
    }
    public static int race_track(int[] arr,int no_kid) {
        int s=0,e=(int)1e9;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ispossible(mid,arr,no_kid)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,8,9};
        int no_kid=2;
        int ans=race_track(arr,no_kid);
        System.out.println(ans);
    }
}
