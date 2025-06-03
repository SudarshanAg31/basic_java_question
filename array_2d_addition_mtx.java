
import java.util.Scanner;
public class array_2d_addition_mtx {
    public static int[][] inputarr(int[][] arr,Scanner sc) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static int[][] sumarr(int[][] arr1,int[][]arr2) {
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return arr1;
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
        Scanner sc= new Scanner(System.in);

        int x=sc.nextInt();
        int y=sc.nextInt();
        int[][] arr=new int[x][y];
        int[][] arr1=inputarr(arr,sc);

        int[][] arr2=new int[x][y];
        int[][] arr3=inputarr(arr2,sc);

        int[][] arr4=sumarr(arr1,arr3);

        printarr(arr4);
    }
}
