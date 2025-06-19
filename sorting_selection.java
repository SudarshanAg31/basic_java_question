public class sorting_selection {
    public static int[] sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
        int idx=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[idx]>arr[j]){
                idx=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
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
