public class array_mainpulation {
    public static void main(String[] args) {
        int[] x={1,1,2,2,3,3,4};
        for(int i=0;i<x.length;i++){
            if(x[i]==-1) continue;
            for(int j=i+1;j<x.length;j++){
                if(x[i]==x[j]){
                    x[i]=-1;
                    x[j]=-1;
                    break;
                }
            }
        }
        for(int i=0;i<x.length;i++){
            if(x[i]>0){
                System.out.println(x[i]);
            }
        }
    }
}
