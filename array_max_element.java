public class array_max_element {
    public static void main(String[] args) {
        //int[] x={9,6,2,27,8,45,3,4,6,7,86,34,53,35,1,0};
        int[] x={-9,-6,-2,-27,-8,-45,-3,-4,-6,-7,-86,-34,-53,-35,-1,0};
        int y=x[0];
        for(int i=0;i<x.length;i++){
            if (x[i]>y){
                y=x[i];
            }
        }
        System.out.println(y);
    }
}
