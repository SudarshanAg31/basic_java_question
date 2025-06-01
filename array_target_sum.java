
import java.util.Scanner;

public class array_target_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] x={4,6,3,5,8,2};
        int target=sc.nextInt();
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
            if(x[i]+x[j]==target){
                System.out.print("("+x[i]+","+x[j]+") ");
            }
        }
        }
    }
}
