public class sorting_zero_to_end {
public static int[] sort(int[] arr) {
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]==0&&arr[j+1]!=0){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    return arr;
}
    public static void main(String[] args) {
        int[] arr={0,2,1,0,5,4};
        int[] ans=sort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
