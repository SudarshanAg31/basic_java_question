public class sorting_count {
    public static void frq(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] ans=new int[max+1];
        for(int i=0;i<arr.length;i++){
            ans[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<ans.length;i++){
            while(ans[i]!=0){
                arr[k++]=i;
                ans[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4,3,2,1,3,2,4,2,5};
        frq(arr);
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" "); 
        }
    }
}
