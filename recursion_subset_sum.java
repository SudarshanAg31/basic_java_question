public class recursion_subset_sum {
    public static void printn(int[] x,int n,int index,int sum) {
        if(index>=n){
            System.out.println(sum);
            return;
        }
        printn(x, n, index+1, sum+x[index]);
        printn(x, n, index+1, sum);
    }
    public static void main(String[] args) {
        int[] x={1,2,3};
        printn(x,x.length,0,0);
    }
}
