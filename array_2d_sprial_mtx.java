
import java.util.Scanner;

public class array_2d_sprial_mtx {
    public static int[][] sprial(int n) {
        int[][] arr=new int[n][n];
        int count=1;
        int tr=0;int br=n-1;int lc=0;int rc=n-1;
        while (count<=n*n) { 
            //for top> lc to rc
            for(int j=lc;j<=rc&&count<=n*n;j++){
                arr[tr][j]=count++;
            }
            tr++;
            //for right col> top to bottom
            for(int j=tr;j<=br&&count<=n*n;j++){
                arr[j][rc]=count++;
            }
            rc--;
            //for bottom> rc to lc
            for(int j=rc;j>=lc&&count<=n*n;j--){
                arr[br][j]=count++;
            }
            br--;
            //for left col> bottom to top
            for(int j=br;j>=tr&&count<=n*n;j--){
                arr[j][lc]=count++;
            }
            lc++;
        }
        return arr;
    }
    public static void printarr(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=sprial(n);
        printarr(arr);
    }
}
