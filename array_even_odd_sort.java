public class array_even_odd_sort {
    public static void swap(int[] arr,int start,int end) {
        while(start<end){
            if(arr[start]%2==1&&arr[end]%2==0){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            if(arr[start]%2==0){
                start++;
            }
            if(arr[end]%2==1){
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int[] x={1,2,3,4,5,6,7,8,9,71,21,14,51};
        swap(x,0,x.length-1);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }
}
