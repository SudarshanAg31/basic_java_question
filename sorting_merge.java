class sorting_merge{
    public static void merge(int[] arr,int l,int mid,int r) {
    int n1=mid-l+1;
    int n2=r-mid;
    int[] start=new int[n1];
    int[] last=new int[n2];
    int i,j,k;
    for(i=0;i<n1;i++)start[i]=arr[l+i];
    for(j=0;j<n2;j++)last[j]=arr[mid+1+j];
    i=0;
    j=0;
    k=l;
    while(i<n1&&j<n2){
        if(start[i]<last[j]){
        arr[k++]=start[i++];
        }
        else{
            arr[k++]=last[j++];
        }
    }
    while(i<n1){
        arr[k++]=start[i++];
    }
    while(j<n2){
        arr[k++]=last[j++];
    }
    }
    public static void sort(int[] arr,int l,int r) {
        if(l>=r)return;
        int mid=(l+r)/2;
        sort(arr, l, mid);
        sort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        int x=arr.length;
        sort(arr,0,x-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}