public class binary_search_first_occurrence {
    public static int binary_search(int[] arr,int start,int end,int tar) {
        int res=-1;
        while(start<=end){
            int mid=start+((end-start)/2);
            if(tar==arr[mid]){
            res=mid;
            end=mid-1;
        }
            else if(tar>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={2,5,5,5,6,6,8,9,9,9};
        int tar=5;
        int x=binary_search(arr,0,arr.length-1,tar);
        System.out.println(x);
    }
}
