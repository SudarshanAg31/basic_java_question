public class binary_search_squr_root {
    public static int sqrt(int val) {
        int s=0,e=val;
        int ans=-1;
        while(s<=e){
            int mid=s+((e-s)/2);
            int x=mid*mid;
            if(x==val)return mid;
            else if(x<val){
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
        int val=11;
        System.out.println(sqrt(val));
    }
}
