import java.util.Scanner;
public class array_prefix_subarrays_sum {
    public static int[] pref(int[] arr) {
        int z=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+z;
            z=arr[i];
        }
        return arr;
    }
    public static boolean check(int[] arr) {
        boolean x=false;
        for(int i=0;i<arr.length;i++){
            if((double)arr[arr.length-1]/2==(double)arr[i]){
                x=true;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr1=pref(arr);
        boolean x=check(arr1);
        System.out.println(x);
    }
}
