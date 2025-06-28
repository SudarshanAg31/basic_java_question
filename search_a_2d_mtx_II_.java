public class search_a_2d_mtx_II_ {
    public static boolean  search_mtx(int[][] arr,int tar) {
        int r=arr.length;
        int c=arr[0].length;
        int i=0,j=c-1;
        while(i<r&&0<=j){
            if(arr[i][j]==tar)return true;
            if(tar<arr[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{2,4,6,8},{5,6,7,20},{7,11,13,25},{12,14,17,30}};
        int tar=14;
        boolean x=search_mtx(arr,tar);
        System.out.println(x);
    }
}
