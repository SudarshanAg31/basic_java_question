public class _recursion_frog_jump {
    public static int printn(int[] x,int y,int z) {
        if(y==z-1)return 0;
        int a=Math.abs(x[y]-x[y+1])+printn(x, y+1,z);
        if(y==z-2)return a;
        int b=Math.abs(x[y]-x[y+2])+printn(x, y+2, z);
        return Math.min(a, b);
    }
    public static void main(String[] args) {
        int[] x={10,30,40,20};
        int y=printn(x,0,x.length);
        System.out.println(y);
    }
}
