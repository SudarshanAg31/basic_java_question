import java.util.Scanner;
public class array_prefix_sum_queries {
    public static int[] perf(int[] arr) {
        int z=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+z;
            z=arr[i];
        }
        return arr;
    }
    public static int sys(int[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.print("start:");
        int l=sc.nextInt();
        System.out.print("end:");
        int r=sc.nextInt();
        int z=0;
        if (l==1)z=arr[r-1];
        else z=arr[r-1]-arr[l-2];
        return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//size of array
        int[] arr=new int[n];
        for(int i=0;i<n;i++){//input of array
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();//number of queries
        int[] arr1=perf(arr);
        while(q>0){
        int z=sys(arr1);
        System.out.println(z);
        q--;
        }
    }
}