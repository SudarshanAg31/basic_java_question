
class sorting_quick{
    public static int position(int[] arr,int l,int r) {
        int pi=arr[l];
        int count=0;
        for(int i=l+1;i<=r;i++){
            if(pi>=arr[i]){
                count++;
            }
        }
        int idx_pi=count+l;
        swap(arr,idx_pi,l); 
        int i=l;
        int j=r;
        while(i<idx_pi&&j>idx_pi){
            while(arr[i]<=arr[idx_pi]){
                i++;
            }
            while(arr[j]>arr[idx_pi]){
                j--;
            }
            if(i<idx_pi&&j>idx_pi){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return idx_pi;
    }
    public static void swap(int[] arr,int idx_pi,int l ) {
        int temp=arr[idx_pi];
        arr[idx_pi]=arr[l];
        arr[l]=temp;
    }
    public static void sort(int[] arr,int l,int r) {
        if(l>=r)return;
        int pi=position(arr,l,r);
        sort(arr,l,pi-1);
        sort(arr,pi+1,r);
    }
    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        sort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}