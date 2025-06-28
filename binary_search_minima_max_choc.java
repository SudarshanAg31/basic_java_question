public class binary_search_minima_max_choc {
    public static boolean  isdivchoc(int[]arr,int student,int mid) {
        int no_of_stud=1;
        int no_of_cho=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mid)return false;
            if(arr[i]+no_of_cho<=mid){
                no_of_cho+=arr[i];
            }
            else{
                no_of_stud++;
                no_of_cho=arr[i];
            }
        }
        if(no_of_stud<=student){
            return true;
        }
        else{
            return false;
        }
    }
    public static int minimamax(int[] arr,int student) {
        int s=1;
        int ans=0;
        int e=(int)1e9;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isdivchoc(arr,student,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }        
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={12,34,67,90};
        int student=2;
        int ans=minimamax(arr,student);
        System.out.println(ans);
    }
}
