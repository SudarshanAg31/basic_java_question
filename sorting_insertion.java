public class sorting_insertion {
    public static int[] sort(int[] arr) {
        int x=arr.length;
        for(int i=1;i<x;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                   int temp=arr[j-1];
                   arr[j-1]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        int[] ans=sort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
