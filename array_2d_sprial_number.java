import java.util.Scanner;
public class array_2d_sprial_number {
public static int[][] inputarr(int n,Scanner sc) {
    int[][] arr=new int[n][n];
    int x=1;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=x++;
        }
    }
    return arr;
}
public static void splial(int[][] arr,int n) {
    int r=n;
    int c=n;
    int tr=0;int br=r-1;int lc=0;int rc=c-1;
    int total_ele=0;
    while (total_ele<r*c) { 
        //top row> left to right col
        for(int j=lc;j<=rc&&total_ele<r*c;j++){
            System.out.print(arr[tr][j]+" ");
        total_ele++;
        }
        tr++;
        //right col> top to bottom row
        for(int j=tr;j<=br&&total_ele<r*c;j++){
            System.out.print(arr[j][rc]+" ");
        total_ele++;
        }
        rc--;
        //bottom row> right to left col
        for(int j=rc;j>=lc&&total_ele<r*c;j--){
            System.out.print(arr[br][j]+" ");
        total_ele++;
        }
        br--;
        //left col> bottom to top row
        for(int j=br;j>=tr&&total_ele<r*c;j--){
            System.out.print(arr[j][lc]+" ");
        total_ele++;
        }
        lc++;
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]arr=inputarr(n,sc);
        splial(arr,n);
    }
}
