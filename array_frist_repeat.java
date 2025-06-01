public class array_frist_repeat {
    public static void main(String[] args) {
        int[] x={1,2,3,4,5,4};
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
            if(x[i]==x[j]){  
                System.out.println(x[i]);
                System.exit(0);    
            }
        }
    }
    System.out.println("-1"); 
}
}
