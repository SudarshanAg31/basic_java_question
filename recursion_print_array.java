public record recursion_print_array() {
    public static void array_print(int[] arr,int x) {
        if(x==-1){
            return;
        }
        array_print(arr, x-1);
        System.out.println(arr[x]);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int x=arr.length; 
        array_print(arr,x-1);
    }
}
