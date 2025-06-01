/*
public class array_non_dec_square {
    public static void square(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
    }
    public static void sort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }      
            }           
        }
    }
    public static void main(String[] args) {
        int[] x={-10,-3,-2,1,4,5};
        square(x);
        sort(x);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }
}
*/

public class array_non_dec_square{
    public static int[] square(int[] arr,int start,int end) {
        int[] arr1=new int[arr.length];
        int i=0;
        while(start<=end){
            if(Math.abs(arr[start])>Math.abs(arr[end])){
                arr1[i]=arr[start]*arr[start];
                start++;
            }
            else{
                arr1[i]=arr[end]*arr[end];
                end--;
            }
            i++;
        }
        return arr1;
    }
    public static void reverse(int[] arr,int start,int end) {
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] x={-10,-3,-2,1,4,5};
        int[] arr1=square(x,0,x.length-1);
        reverse(arr1, 0, x.length-1);
        for(int i=0;i<x.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}