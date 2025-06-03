
import java.util.Scanner;

public class array_2d_rotate_mtx {
public static int[][] inputarr(int[][] arr,Scanner sc) { 
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    return arr;
}
public static int[][] transpose(int[][] arr) {
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr[i].length;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
    return arr;
}
public static void reverse(int[] arr) {
    int start=0;
    int end=arr.length-1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
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
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int[][] arr=new int[x][y];
        int[][] arr1=inputarr(arr,sc);
        int[][] arr2=transpose(arr1);
        for(int i=0;i<x;i++){
            reverse(arr2[i]);
        }
        printarr(arr2);
    }
}
