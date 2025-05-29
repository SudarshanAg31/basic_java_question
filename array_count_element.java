
import java.util.Scanner;

public class array_count_element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int y=sc.nextInt();
        int[] x={1,2,5,64,54,53,532,364,542,24,5,53};
        int count=0;
        for(int i=0;i<x.length;i++){
            if (x[i]>y){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
