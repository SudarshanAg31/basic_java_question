
import java.util.Scanner;

public class array_two_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int[] x={12,21,38,69,74,54};
        boolean flag=false;
        for(int i=0;i<x.length;i++){
            for(int j=i+1;j<x.length;j++){
                if(x[i]+x[j]==y){
                    flag=true;
                }
            }
        }
        if (flag==true) System.out.println("yes");
        else System.out.println("no");
    }
}
