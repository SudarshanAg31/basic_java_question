

/*public class array_0_and_1_sort {
    public static void main(String[] args) {
        int[] x={1,0,1,0,1,1,1,0,0};
        int count=0;
        for(int i=0;i<x.length;i++){
            if(x[i]==0){
                count++;
            }
        }
        for(int i=0;i<x.length;i++){
            if(i<count)x[i]=0;
            else x[i]=1;     
        }
          for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }
}
*/

// by two pointers

public class array_0_and_1_sort {
    public static void swap(int[] arr,int start,int end) {
        int temp;
        while(start<end){
            if(arr[start]==0){
                start++;
            }
            if(arr[end]==1){
                end--;
            }
            if(arr[start]==1&&arr[end]==0){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            }
        }
    }
    public static void main(String[] args) {
        int[] x={1,0,1,0,1,0,1,1,1,0,0,1,0};
        swap(x,0,x.length-1);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }
} 