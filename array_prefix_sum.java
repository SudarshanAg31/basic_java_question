public class array_prefix_sum {
    public static void main(String[] args) {
        int[] x={2,1,3,4,5};
        int z=0;
        for(int i=0;i<x.length;i++){
            x[i]=x[i]+z;
            z=x[i];
        }
        for(int i=0;i<x.length;i++){
           System.out.print(x[i]+" ");
        }
    }
}
