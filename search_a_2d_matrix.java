public class search_a_2d_matrix {
    public static int search_mtx(int[][] arr,int tar) {
        int r=arr.length;
        int c=arr[0].length;
        int s=0;
        int e=r*c-1;
        while(s<=e){
            int mid=s+((e-s)/2);
            int midel=arr[mid/c][mid%c];
            if(midel==tar){
                return mid;
            }
            else if(midel>tar){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int tar=3;
        int x=search_mtx(arr,tar);
        System.out.println(x);
    }
}
