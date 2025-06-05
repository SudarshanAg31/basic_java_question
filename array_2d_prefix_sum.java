
import java.util.Scanner;

public class array_2d_prefix_sum {
    public static int[][] inputarr(int n,Scanner sc) {
    int[][] arr=new int[n][n];        
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    return arr;
    }
    public static int[][] prefixsumhor(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            int z=0;
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=arr[i][j]+z;
                z=arr[i][j];
            }
        }
        return arr;
    }
    public static int[][] prefixsumver(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            int z=0;
            for(int j=0;j<arr[i].length;j++){
                arr[j][i]=arr[j][i]+z;
                z=arr[j][i];
            }
        }
        return arr;
    }
    public static int prefixfinal(int[][] arr,Scanner sc){
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int z=0;
        //we always take r1 and c1> 0;
        if(r1>0&&c1>0)
        z=arr[r2][c2]-arr[r1-1][c2]-arr[r2][c1-1]+arr[r1-1][c1-1];
        return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[][] arr=inputarr(x,sc);
        int[][] arr1=prefixsumhor(arr); 
        int[][] arr2=prefixsumver(arr1);
        int ans=prefixfinal(arr2, sc);
        System.out.println(ans);
    }
}