
import java.util.Scanner;

public class array_2d_transpose_mtx {
public static int[][] inputarr(int[][] arr,Scanner sc) { 
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    return arr;
}
public static int[][] transpose_extra_variable(int[][] arr,int x,int y) {
    int[][] arr1=new int[x][y];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr1[j][i]=arr[i][j];
        }
    }
    return arr1;
}
public static void printarr(int[][] arr) {
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.print("");
    }
    System.out.println("");
}
public static int[][] transpose_no_extra_variable(int[][] arr) {
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr[i].length;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
    return arr;
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int[][] arr=new int[x][y];
        int[][] arr1=inputarr(arr,sc);
        int[][] arr2=transpose_extra_variable(arr1,x,y);
        int[][] arr3=transpose_no_extra_variable(arr1);
        printarr(arr2);
        printarr(arr3);
    }
}
