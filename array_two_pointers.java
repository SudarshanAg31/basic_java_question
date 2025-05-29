public class array_two_pointers {
    public static void main(String[] args) {
        int[] x={1,2,3,4,5,6,7};
        int temp=0;
        for(int i=0;i<x.length/2;i++){
            temp=x[i];
            x[i]=x[x.length-i-1];
            x[x.length-i-1]=temp;
        }
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }
}
