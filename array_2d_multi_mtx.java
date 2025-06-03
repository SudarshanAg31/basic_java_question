import java.util.Scanner;
public class array_2d_multi_mtx {
    public static int[][] inputarr(int[][] arr,Scanner sc) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    public static int[][] prod(int[][] arr1,int[][]arr2,int x,int x1,int y,int y1) {
        int[][] arr=new int[x][y1];
        if(y!=x1){
            System.out.println("not possible");
            System.exit(0);
        }
        else{
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int z=0;
                for(int k=0;k<y;k++){
                    z=arr1[i][k]*arr2[k][j]+z;
                }
                arr[i][j]=z;
            }
        }
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
        int x=sc.nextInt();
        int y=sc.nextInt(); 
        int[][] arr1=new int[x][y];
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int[][] arr2=new int[x1][y1];
        
        int[][] arr3=inputarr(arr1,sc);
        int[][] arr4=inputarr(arr2,sc);

        int[][] arr5=prod(arr3, arr4,x,x1,y,y1);
        printarr(arr5);
    }
}
