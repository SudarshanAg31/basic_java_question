public class array_sec_larg_element {
    public static void main(String[] args) {
        int[] x={1,1,1,1,1};
        int y=x[0];//max
        int z=x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]>y){
                y=x[i];
            }
        }
        for(int i=0;i<x.length;i++){
            if(x[i]>z && x[i]!=y){
                z=x[i];
            }    
    }
    if(y==z)System.out.println("-1");
    else System.out.println(z); 
}
}
