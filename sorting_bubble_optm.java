public class sorting_bubble_optm {
    public class sorting_bubble {
    public static int[] sort(int[] arr,int x) {
        for(int i=0;i<x-1;i++){
            int count=0;
            for(int j=0;j<x-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
            if(count==0){
                return arr;
            }
        } 
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={3,2,4,5,6};
        int x=arr.length;
        int[] ans=sort(arr,x);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
}
