
import java.util.Scanner;

public class array_triplets_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int[] x={1,4,5,6,3};
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                for(int k=j+1;k<x.length;k++){
                    if(x[i]+x[j]+x[k]==target)
                    System.out.print("("+x[i]+","+x[j]+","+x[k]+") ");
                }
            }
        }
    }
}
