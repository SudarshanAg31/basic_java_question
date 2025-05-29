public class array_element_sum {
    public static void main(String[] args) {
        int[] x={12,44,54,54,77,88,56,57,56,64,65,32,45};
        int sum=0;
        for(int i=0;i<x.length;i++){
            sum+=x[i];
        }
        System.out.println(sum);
    }
}
