public class binary_search_multi_peak {
    public static int find_peak(int[] arr,int s,int e) {
        while(s<=e){
            int mid=s+((e-s)/2);
            if((mid==0||arr[mid]>arr[mid+1])&&(arr.length-1==mid||arr[mid-1]<arr[mid])){
                return mid;
            }
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,4,6,5,4};
        int ans=find_peak(arr,0,arr.length-1);
        System.out.println(ans);
    }
}
