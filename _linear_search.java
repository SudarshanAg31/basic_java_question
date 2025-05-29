
import java.util.Scanner;

public class _linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input of array
        int[] x=new int[10];
        for(int i=0;i<10;i++){
            x[i]=sc.nextInt();
        }
        //element to be search
        int y=sc.nextInt();
        //output or answer
        for(int i=0;i<=x.length;i++){
            if(y==x[i]){
                System.out.println(i);
            }
        }
    }
}
