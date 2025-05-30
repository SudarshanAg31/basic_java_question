
import java.util.Scanner;

public class array_k_steps_rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("length of array");
        int x=sc.nextInt();
        int[] arr=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("rotate array");
        int y=sc.nextInt();
        y=y%arr.length;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
            for(int i=0;i<(y)/2;i++){
            int temp=arr[i];
            arr[i]=arr[y-i-1];
            arr[y-i-1]=temp;
        }
            for(int i=0;i<(arr.length-y)/2;i++){
            int temp=arr[y+i];
            arr[y+i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
